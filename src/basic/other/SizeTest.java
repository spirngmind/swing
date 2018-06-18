package basic.other;

import javax.swing.*;
import java.awt.*;

/**
 * @author zhenghang
 * @date 18-6-17 下午4:19
 */
public class SizeTest {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
//        frame.setSize(300,700);
        frame.setBounds(400,50,300,500);
        frame.setLayout(null);

        JPanel mainPanel=new JPanel();
        JLabel label=new JLabel("test");
        mainPanel.setBackground(Color.red);
        mainPanel.add(label);
        mainPanel.setBounds(20,30,100,300);

        frame.add(mainPanel);

        frame.setVisible(true);
    }
}
