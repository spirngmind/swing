package basic.other;

import bean.Book;

import javax.swing.*;
import java.awt.*;

/**
 * @author zhenghang
 * @date 2018/5/28 21:38
 */
public class SplitPaneTest {
    Book[] books=new Book[]{
        new Book("java",new ImageIcon("ico/java.png"),"java book"),
        new Book("javaEE",new ImageIcon("ico/javaEE.png"),"javaEE book"),
        new Book("Android",new ImageIcon("ico/android.png"),"android book")
    };

    JFrame jf=new JFrame("split panel test");

    JList<Book> bookList=new JList<>(books);
    JLabel bookCover=new JLabel();
    JTextArea bookDesc=new JTextArea();

    public void init(){
        bookList.setPreferredSize(new Dimension(150,300));
        bookCover.setPreferredSize(new Dimension(600,150));
        bookDesc.setPreferredSize(new Dimension(600,150));

        bookList.addListSelectionListener(e->{
            Book book=(Book)bookList.getSelectedValue();
            bookCover.setIcon(book.getIcon());
            bookDesc.setText(book.getIntroduction());
        });

        JSplitPane left=new JSplitPane(JSplitPane.VERTICAL_SPLIT,true,bookCover,new JScrollPane(bookDesc));
        left.setOneTouchExpandable(true);
        left.resetToPreferredSizes();

        JSplitPane content=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,left,bookList);

        jf.add(content);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new SplitPaneTest().init();
    }

}
