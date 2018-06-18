package codeflow;

import codeflow.codeflow.bean.Detail;
import codeflow.codeflow.bean.Findbugs;
import codeflow.service.FindbugsService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

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
        frame.setBounds(40,40,650,570);
        frame.setLayout(null);

        mainPanel.setBounds(0,0,650,570);
        mainPanel.setLayout(null);

        reportPanel.setBounds(0,0,650,65);
//        reportPanel.setBackground(Color.red);

        detailPanel.setBounds(0,70,650,500);
//        detailPanel.setBackground(Color.green);


        mainPanel.add(reportPanel);
        mainPanel.add(detailPanel);
        frame.add(mainPanel);

        initReportPanel();
        initDetailPanel(findbugs.getHighDetails(),"High Detail");

        frame.setVisible(true);
    }

    public void initReportPanel(){
        reportPanel.setLayout(null);

        JLabel reportLabel=new JLabel("report");
        reportLabel.setBounds(5,0,300,20);
        reportPanel.add(reportLabel);

        Object[][] tableData={
                new Object[]{findbugs.getTotal(),findbugs.getHigh(),findbugs.getNormal(),findbugs.getLow()}
        };
        Object[] columnTitle={"total","high","normal","low"};
        JTable table=new JTable(tableData,columnTitle);

        table.setCellSelectionEnabled(true);

        table.addMouseListener(new MouseAdapter(){

            public void mouseClicked(MouseEvent e) {
                //得到选中的行列的索引值
                int r= table.getSelectedRow();
                int c= table.getSelectedColumn();

                switch (c){
                    case 0:break;
                    case 1:
                        initDetailPanel(findbugs.getHighDetails(),"High Detail");
                        break;
                    case 2:
                        ArrayList<Detail> normalDetails=new FindbugsService().getNormalDetails();
                        initDetailPanel(normalDetails,"Normal Detail");
                        break;
                    case 3:
                        ArrayList<Detail> lowDetails=new FindbugsService().getLowDetails();
                        initDetailPanel(lowDetails,"Low Detail");
                        break;
                }


                //得到选中的单元格的值，表格中都是字符串
                Object value= table.getValueAt(r, c);
                String info=r+"行"+c+"列值 : "+value.toString();
                System.out.println(info);

            }
        });

        JScrollPane tablePanel=new JScrollPane(table);
        tablePanel.setBounds(5,25,275,39);

        reportPanel.add(tablePanel);
    }

    public void initDetailPanel(ArrayList<Detail> details,String detailName){
        detailPanel.removeAll();
        detailPanel.setLayout(null);
        JLabel detailLabel=new JLabel(detailName);
        detailLabel.setBounds(5,5,300,15);
        detailPanel.add(detailLabel);

        JPanel contentPanel=new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(600,11+50*details.size()));

        JScrollPane contentJScrollPanel=new JScrollPane();
        contentJScrollPanel.setBounds(5,20,620,430);

        for (int i=0;i<details.size();i++) {
            Detail curDetail= details.get(i);

            JPanel curPanel=new JPanel();
            curPanel.setLayout(null);
            curPanel.setBounds(2,2+i*50,600,50);
            curPanel.setBorder(BorderFactory.createEtchedBorder());

            JLabel locationLabel=new JLabel(curDetail.getLocation());
            JLabel simpleCueLabel=new JLabel(curDetail.getSimpleCue());
            JLabel detailCueLabel=new JLabel(curDetail.getDetailCue());
            locationLabel.setBounds(5,5,100,15);
            simpleCueLabel.setBounds(110,5,160,15);
            detailCueLabel.setBounds(5,20,620,20);

            curPanel.add(locationLabel);
            curPanel.add(simpleCueLabel);
            curPanel.add(detailCueLabel);

            contentPanel.add(curPanel);
        }
        contentJScrollPanel.setViewportView(contentPanel);
        detailPanel.add(contentJScrollPanel);

        detailPanel.validate();
        detailPanel.repaint();
    }

    public static void main(String[] args) {
        new CodeflowBak().init();
    }
}
