package codeflow;

import codeflow.codeflow.bean.Detail;
import codeflow.codeflow.bean.Findbugs;
import codeflow.service.FindbugsService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * @author zhenghang
 * @date 18-6-17 下午3:55
 */
public class Codeflow {
    JFrame frame=new JFrame("codeflow");
    JPanel mainPanel=new JPanel();
    JPanel reportPanel=new JPanel();
    JPanel detailPanel=new JPanel();
    JPanel pagerPanel=new JPanel();

    JButton fristBtn=new JButton("首页");
    JButton preBtn=new JButton("上一页");
    JButton nextBtn=new JButton("下一页");
    JButton lastBtn=new JButton("尾页");
    Pager pager;

    String detailType;
    Findbugs findbugs=new FindbugsService().getFindbugs();

    public void init(){
        ArrayList<Detail> highDetails=findbugs.getHighDetails();
        detailType="High Details";
        pager=new Pager(highDetails.size(),highDetails);
//        frame.setBounds(40,40,650,570);
        frame.setBounds(40,40,650,470);
        frame.setLayout(null);

//        mainPanel.setBounds(0,0,650,570);
        mainPanel.setBounds(0,0,650,470);
        mainPanel.setLayout(null);

        reportPanel.setBounds(0,0,650,65);
//        reportPanel.setBackground(Color.red);

        detailPanel.setBounds(0,70,650,290);
//        detailPanel.setBackground(Color.red);

        pagerPanel.setBounds(0,380,650,50);
//        pagerPanel.setBackground(Color.green);

        mainPanel.add(reportPanel);
        mainPanel.add(detailPanel);
        mainPanel.add(pagerPanel);
        frame.add(mainPanel);

        initReportPanel();
        initDetailPanel(new ArrayList<>(pager.getPageData()));
        initPagerPanel();
        frame.setVisible(true);
    }

    public void initPagerPanel(){


//        fristBtn.addActionListener(this);
        fristBtn.addActionListener(new PagerListener());
        preBtn.addActionListener(new PagerListener());
        nextBtn.addActionListener(new PagerListener());
        lastBtn.addActionListener(new PagerListener());

        pagerPanel.add(fristBtn);
        pagerPanel.add(preBtn);
        pagerPanel.add(nextBtn);
        pagerPanel.add(lastBtn);
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
                        detailType="High Detail";
                        pager=new Pager(findbugs.getHighDetails().size(),findbugs.getHighDetails());
                        initDetailPanel(new ArrayList<>(pager.getPageData()));
                        break;
                    case 2:
                        ArrayList<Detail> normalDetails=new FindbugsService().getNormalDetails();
                        detailType="Normal Detail";
                        pager=new Pager(normalDetails.size(),normalDetails);
                        initDetailPanel(new ArrayList<>(pager.getPageData()));
                        break;
                    case 3:
                        ArrayList<Detail> lowDetails=new FindbugsService().getLowDetails();
                        detailType="Low Detail";
                        pager=new Pager(lowDetails.size(),lowDetails);
                        initDetailPanel(new ArrayList<>(pager.getPageData()));
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

    public void initDetailPanel(ArrayList<Detail> details){
        detailPanel.removeAll();
        detailPanel.setLayout(null);
        JLabel detailLabel=new JLabel(detailType);
        detailLabel.setBounds(5,5,300,15);
        detailPanel.add(detailLabel);

        JPanel contentPanel=new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(600,11+50*details.size()));

        JScrollPane contentJScrollPanel=new JScrollPane();
        contentJScrollPanel.setBounds(5,20,615,265);

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


    class PagerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton button = (JButton) e.getSource();
            if (button.equals(fristBtn)) {
                pager.currentPage=pager.getFirstPage();
            }
            if (button.equals(preBtn)) {
                pager.getPreviousPage();
            }
            if (button.equals(nextBtn)) {
                pager.getNextPage();
            }
            if (button.equals(lastBtn)) {
                pager.currentPage=pager.getLastPage();
            }

            initDetailPanel(new ArrayList<>(pager.getPageData()));
        }
    }

    public static void main(String[] args) {
        new Codeflow().init();
    }
}
