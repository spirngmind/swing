package basic;

import javax.swing.*;

/**
 * @author zhenghang
 * @date 2018/5/28 22:44
 */
public class SimpleTable {
    JFrame jf=new JFrame("table test");
    JTable table;
    Object[][] tableData={
            new Object[]{"jim",10,"male"},
            new Object[]{"alex",11,"female"},
            new Object[]{"paul",12,"male"}
    };
    Object[] columnTitle={"name","age","gender"};

    public void init(){
        table=new JTable(tableData,columnTitle);
        table.setAutoResizeMode(0);
        jf.add(new JScrollPane(table));

        jf.setBounds(0,0,250,130);
//        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleTable().init();
    }
}
