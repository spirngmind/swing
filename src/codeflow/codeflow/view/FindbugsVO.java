package codeflow.codeflow.view;

import codeflow.codeflow.bean.Findbugs;
import codeflow.service.FindbugsService;

/**
 * @author zhenghang
 * @date 18-6-17 下午5:18
 */
public class FindbugsVO {
    private Findbugs findbugs;

    public FindbugsVO(){
        findbugs=getFindbugs();
    }

//    public void getReportVO(Object[][] tableData,Object[] columnTitle){
//        tableData=
//                new Object[]{findbugs.getTotal(),findbugs.getHigh(),findbugs.getNormal(),findbugs.getLow()};
//        columnTitle={"total","high","normal","low"};
//    }

    private Findbugs getFindbugs(){
        return new FindbugsService().getFindbugs();
    }
}
