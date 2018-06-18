package basic.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author zhenghang
 * @date 2018/6/18 16:42
 */
public class EventTest1 {
    private Frame f=new Frame("event test");
    private Button btn=new Button("ok");
    private TextField tf=new TextField(30);
    private int i=0;

    private void init(){
        f.add(tf);
        f.add(btn,BorderLayout.SOUTH);
        btn.addActionListener(new OkListener());

        f.pack();
        f.setVisible(true);
    }

    class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            i++;
            System.out.println("you press ok "+i+" times");
            tf.setText("hello world "+i+"times");
        }
    }

    public static void main(String[] args) {
        new EventTest1().init();
    }
}
