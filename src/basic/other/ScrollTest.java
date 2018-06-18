package basic.other;

import javax.swing.*;
import java.awt.*;

/**
 * @author zhenghang
 * @date 2018/6/17 23:14
 */
public class ScrollTest {
    public static void main(String[] args) {
        JFrame frame=new JFrame("scroll test");
        frame.setLayout(null);
        frame.setBounds(40,40,600,500);

        JPanel mainPanel=new JPanel();
        JLabel label=new JLabel("TEST");
        mainPanel.add(label);
        mainPanel.setBounds(0,0,400,400);
        mainPanel.setBorder(BorderFactory.createEtchedBorder());

        JScrollPane scrollPane=new JScrollPane(mainPanel);
        scrollPane.setBounds(5,5,100,100);


        frame.add(scrollPane);
        frame.setVisible(true);

    }
}
