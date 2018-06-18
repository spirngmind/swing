package basic.other;

import javax.swing.*;

/**
 * @author zhenghang
 * @date 2018/6/17 18:56
 */
public class TableTest {
    JFrame frame=new JFrame("table test");
    JTable table;
    Object[][] tableData={
      new Object[]{"li",29,"female"},
      new Object[]{"liu",28,"female"},
      new Object[]{"ling",23,"male"}
    };
    Object[] columnTitle={"name","age","gender"};

    public void init(){
        table=new JTable(tableData,columnTitle);
        JScrollPane scrollPane=new JScrollPane(table);


        frame.add(scrollPane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TableTest().init();
    }

}
