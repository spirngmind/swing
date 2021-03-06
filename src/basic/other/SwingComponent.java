package basic.other;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

public class SwingComponent {
    JFrame f = new JFrame("测试");

    JButton ok = new JButton("确认");

    JRadioButton male = new JRadioButton("男",true);
    JRadioButton female = new JRadioButton("女",false);
    ButtonGroup bg = new ButtonGroup();

    JCheckBox married = new JCheckBox("是否已婚",false);

    String[] colors = new String[]{"红色","绿色","蓝色"};
    JComboBox<String> colorChooser = new JComboBox<>(colors);
    JList<String> colorlist = new JList<>(colors);

//    JTextArea ta = new JTextArea(8,20);
    JPanel ta= new JPanel();

    JTextField name = new JTextField(40);

    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("文件");
    JMenu edit = new JMenu("编辑");

    JMenuItem newItem = new JMenuItem("新建");
    JMenuItem saveItem = new JMenuItem("保存");
    JMenuItem exitItem = new JMenuItem("退出");
    JMenuItem copyItem = new JMenuItem("复制");
    JMenuItem pasteItem = new JMenuItem("粘贴");


    JMenu format = new JMenu("格式");
    JMenuItem commentItem = new JMenuItem("注释");
    JMenuItem cancelItem = new JMenuItem("取消注释");

    public void init(){
        JPanel bottom = new JPanel();
        bottom.add(name);
        bottom.add(ok);
        f.add(bottom,BorderLayout.SOUTH);


        JPanel checkPanel = new JPanel();
        bg.add(male);
        bg.add(female);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);
        checkPanel.add(colorChooser);

        Box topLeft = Box.createVerticalBox();

//        ta.setSize(new Dimension(700,800));
        ta.setMinimumSize(new Dimension(500,400));
        ta.setPreferredSize(new Dimension(500,400));
        ta.setBackground(Color.red);
        JScrollPane taJsp = new JScrollPane(ta);
        topLeft.add(taJsp);
        topLeft.add(checkPanel);

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorlist);

        f.add(top);

        newItem.setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.CTRL_MASK));
//        newItem.addActionListener(e->ta.append("用户单击了dd'新建'菜单\n"));

        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);

        edit.add(copyItem);
        edit.add(pasteItem);

        commentItem.setToolTipText("将程序代码注释");
        format.add(commentItem);
        format.add(cancelItem);

        edit.add(format);

        mb.add(file);
        mb.add(edit);

        f.setJMenuBar(mb);

        f.pack();
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new SwingComponent().init();
    }

}
