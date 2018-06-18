package basic.other;

import codeflow.codeflow.bean.Findbugs;
import codeflow.service.FindbugsService;

import javax.swing.*;
import java.awt.*;

/**
 * @author zhenghang
 * @date 18-6-17 下午3:55
 */
public class CodeflowBak {
    JFrame frame=new JFrame("codeflow");
    JPanel mainPanel=new JPanel();
    JPanel reportPanel=new JPanel();
    JPanel detailPanel=new JPanel();

    Findbugs findbugs=new FindbugsService().getFindbugs();

    public void init(){
        frame.setBounds(40,40,300,500);
        frame.setLayout(null);

        mainPanel.setBounds(0,0,300,500);
        mainPanel.setLayout(null);

        reportPanel.setBounds(0,0,300,400);
//        reportPanel.setBackground(Color.red);

        detailPanel.setBounds(0,400,300,100);
        detailPanel.setBackground(Color.green);

        mainPanel.add(reportPanel);
        mainPanel.add(detailPanel);
        frame.add(mainPanel);

        initReportPanel();
        initDetailPanel();

        frame.setVisible(true);
    }

    public void initReportPanel(){
        reportPanel.setLayout(null);

        JLabel reportLabel=new JLabel("report");
        reportLabel.setBounds(5,0,300,20);
//        reportLabel.setBackground(Color.BLACK);
        reportPanel.add(reportLabel);

        JPanel tablePanel=new JPanel();
//        JScrollPane tablePanel=new JScrollPane();
        tablePanel.setBounds(5,25,275,200);
//        tablePanel.setBackground(Color.red);

        reportPanel.add(tablePanel);

//        Object[][] tableData=new Object[1][4];
//        tableData[0]=new Object[]{findbugs.getTotal(),findbugs.getHigh(),findbugs.getNormal(),findbugs.getLow()};
        Object[][] tableData={
                new Object[]{findbugs.getTotal(),findbugs.getHigh(),findbugs.getNormal(),findbugs.getLow()}
        };
        Object[] columnTitle={"total","high","normal","low"};
        JTable table=new JTable(tableData,columnTitle);
//        table.setTableHeader();
        tablePanel.setLayout(new BorderLayout());
        tablePanel.add(table,BorderLayout.SOUTH);
        reportPanel.add(tablePanel);
//        JTable table;
//        Object[][] tableData={
//                new Object[]{"jim",10,"male"},
//                new Object[]{"alex",11,"female"},
//                new Object[]{"paul",12,"male"}
//        };
//        Object[] columnTitle={"name","age","gender"};
//        table=new JTable(tableData,columnTitle);
////        table.setBounds(5,50,300,20);
//        table.setAutoResizeMode(0);
//        JScrollPane scrollPane=new JScrollPane();
//        scrollPane.setBounds(5,50,250,100);
//        scrollPane.add(table);
//
//        reportPanel.add(scrollPane);

    }

    public void initDetailPanel(){
        JLabel detailLabel=new JLabel("detail");
        detailPanel.add(detailLabel);
    }

    public static void main(String[] args) {
        new CodeflowBak().init();
    }
}
