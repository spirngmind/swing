package codeflow.service;

import codeflow.codeflow.bean.Detail;
import codeflow.codeflow.bean.Findbugs;

import java.util.ArrayList;

/**
 * @author zhenghang
 * @date 18-6-17 下午5:08
 */
public class FindbugsService {
    public Findbugs getFindbugs(){
        Findbugs findbugs=new Findbugs();
        findbugs.setTotal("38");
        findbugs.setHigh("13");
        findbugs.setNormal("11");
        findbugs.setLow("14");

        ArrayList<Detail> details=new ArrayList<>();

        Detail detail0=new Detail();
        detail0.setLocation("aspect.java:0");
        detail0.setSimpleCue("High：cant have equals");
        detail0.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail1=new Detail();
        detail1.setLocation("aspect.java:1");
        detail1.setSimpleCue("High：cant have equals");
        detail1.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail2=new Detail();
        detail2.setLocation("aspect.java:2");
        detail2.setSimpleCue("High：cant have equals");
        detail2.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");


        Detail detail3=new Detail();
        detail3.setLocation("aspect.java:3");
        detail3.setSimpleCue("High：cant have equals");
        detail3.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail4=new Detail();
        detail4.setLocation("aspect.java:4");
        detail4.setSimpleCue("High：cant have equals");
        detail4.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail5=new Detail();
        detail5.setLocation("aspect.java:5");
        detail5.setSimpleCue("High：cant have equals");
        detail5.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail6=new Detail();
        detail6.setLocation("aspect.java:6");
        detail6.setSimpleCue("High：cant have equals");
        detail6.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail7=new Detail();
        detail7.setLocation("aspect.java:7");
        detail7.setSimpleCue("High：cant have equals");
        detail7.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail8=new Detail();
        detail8.setLocation("aspect.java:8");
        detail8.setSimpleCue("High：cant have equals");
        detail8.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail9=new Detail();
        detail9.setLocation("aspect.java:9");
        detail9.setSimpleCue("High：cant have equals");
        detail9.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail10=new Detail();
        detail10.setLocation("aspect.java:10");
        detail10.setSimpleCue("High：cant have equals");
        detail10.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail11=new Detail();
        detail11.setLocation("aspect.java:11");
        detail11.setSimpleCue("High：cant have equals");
        detail11.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail12=new Detail();
        detail12.setLocation("aspect.java:12");
        detail12.setSimpleCue("High：cant have equals");
        detail12.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        details.add(detail0);
        details.add(detail1);
        details.add(detail2);
        details.add(detail3);
        details.add(detail4);
        details.add(detail5);
        details.add(detail6);
        details.add(detail7);
        details.add(detail8);
        details.add(detail9);
        details.add(detail10);
        details.add(detail11);
        details.add(detail12);

        findbugs.setHighDetails(details);

        return findbugs;
    }

    public ArrayList<Detail> getNormalDetails(){
        ArrayList<Detail> details=new ArrayList<>();

        Detail detail0=new Detail();
        detail0.setLocation("noraml.java:0");
        detail0.setSimpleCue("noraml：cant have equals");
        detail0.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail1=new Detail();
        detail1.setLocation("noraml.java:1");
        detail1.setSimpleCue("noraml：cant have equals");
        detail1.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail2=new Detail();
        detail2.setLocation("noraml.java:2");
        detail2.setSimpleCue("noraml：cant have equals");
        detail2.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");


        Detail detail3=new Detail();
        detail3.setLocation("noraml.java:3");
        detail3.setSimpleCue("noraml：cant have equals");
        detail3.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail4=new Detail();
        detail4.setLocation("noraml.java:4");
        detail4.setSimpleCue("noraml：cant have equals");
        detail4.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail5=new Detail();
        detail5.setLocation("noraml.java:5");
        detail5.setSimpleCue("noraml：cant have equals");
        detail5.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail6=new Detail();
        detail6.setLocation("noraml.java:6");
        detail6.setSimpleCue("noraml：cant have equals");
        detail6.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail7=new Detail();
        detail7.setLocation("noraml.java:7");
        detail7.setSimpleCue("noraml：cant have equals");
        detail7.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail8=new Detail();
        detail8.setLocation("noraml.java:8");
        detail8.setSimpleCue("noraml：cant have equals");
        detail8.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail9=new Detail();
        detail9.setLocation("noraml.java:9");
        detail9.setSimpleCue("noraml：cant have equals");
        detail9.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail10=new Detail();
        detail10.setLocation("noraml.java:10");
        detail10.setSimpleCue("noraml：cant have equals");
        detail10.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        details.add(detail0);
        details.add(detail1);
        details.add(detail2);
        details.add(detail3);
        details.add(detail4);
        details.add(detail5);
        details.add(detail6);
        details.add(detail7);
        details.add(detail8);
        details.add(detail9);
        details.add(detail10);

        return details;
    }

    public ArrayList<Detail> getLowDetails(){
        ArrayList<Detail> details=new ArrayList<>();

        Detail detail0=new Detail();
        detail0.setLocation("low.java:0");
        detail0.setSimpleCue("low：cant have equals");
        detail0.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail1=new Detail();
        detail1.setLocation("low.java:1");
        detail1.setSimpleCue("low：cant have equals");
        detail1.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail2=new Detail();
        detail2.setLocation("low.java:2");
        detail2.setSimpleCue("low：cant have equals");
        detail2.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");


        Detail detail3=new Detail();
        detail3.setLocation("low.java:3");
        detail3.setSimpleCue("low：cant have equals");
        detail3.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail4=new Detail();
        detail4.setLocation("low.java:4");
        detail4.setSimpleCue("low：cant have equals");
        detail4.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail5=new Detail();
        detail5.setLocation("low.java:5");
        detail5.setSimpleCue("low：cant have equals");
        detail5.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail6=new Detail();
        detail6.setLocation("low.java:6");
        detail6.setSimpleCue("low：cant have equals");
        detail6.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail7=new Detail();
        detail7.setLocation("low.java:7");
        detail7.setSimpleCue("low：cant have equals");
        detail7.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail8=new Detail();
        detail8.setLocation("low.java:8");
        detail8.setSimpleCue("low：cant have equals");
        detail8.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail9=new Detail();
        detail9.setLocation("low.java:9");
        detail9.setSimpleCue("low：cant have equals");
        detail9.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail10=new Detail();
        detail10.setLocation("low.java:10");
        detail10.setSimpleCue("low：cant have equals");
        detail10.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");

        Detail detail11=new Detail();
        detail11.setLocation("low.java:11");
        detail11.setSimpleCue("low：cant have equals");
        detail11.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");


        Detail detail12=new Detail();
        detail12.setLocation("low.java:12");
        detail12.setSimpleCue("low：cant have equals");
        detail12.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");


        Detail detail13=new Detail();
        detail13.setLocation("low.java:13");
        detail13.setSimpleCue("low：cant have equals");
        detail13.setDetailCue("there is jf.setLocationRelativeTo(null);jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);");


        details.add(detail0);
        details.add(detail1);
        details.add(detail2);
        details.add(detail3);
        details.add(detail4);
        details.add(detail5);
        details.add(detail6);
        details.add(detail7);
        details.add(detail8);
        details.add(detail9);
        details.add(detail10);
        details.add(detail11);
        details.add(detail12);
        details.add(detail13);

        return details;
    }
}
