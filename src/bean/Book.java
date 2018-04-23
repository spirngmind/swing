package bean;

import javax.swing.*;

/**
 * @author zhenghang
 * @date 2018/5/28 21:39
 */
public class Book {
    private String bookName;
    private ImageIcon icon;
    private String introduction;

    public Book(String bookName,ImageIcon icon,String introduction){
        this.bookName=bookName;
        this.icon=icon;
        this.introduction=introduction;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
