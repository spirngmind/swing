package codeflow;

import codeflow.codeflow.bean.Detail;
import codeflow.codeflow.bean.Findbugs;
import codeflow.service.FindbugsService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhenghang
 * @date 2018/6/18 22:39
 */
public class Pager {
    public int currentPage;
    public int pageCount;
    public int totalPage;
    public int totalRowCount;
    public int restCount;

    public ArrayList<Detail> totalDetails;

    public Pager(int totalNum,ArrayList<Detail> totalDetails){
        this.totalRowCount=totalNum;
        this.totalDetails=totalDetails;

        currentPage=1;
        pageCount=5;

        totalPage = totalRowCount % pageCount == 0 ? totalRowCount
                / pageCount : totalRowCount / pageCount + 1;// 结果集的总页数
        restCount = totalRowCount % pageCount == 0 ? 5 : totalRowCount
                % pageCount;// 最后一页的数据数
    }

    public List<Detail> getPageData() {
        List<Detail> details=new ArrayList<>();

        if (this.getCurrentPage() < this.totalPage) {
            int start=(currentPage-1)*pageCount;
            int end=currentPage*pageCount;
            details=totalDetails.subList(start,end);
//            details=(ArrayList)totalDetails.subList(start,end);
        }else{
            int end=totalRowCount;
            int start=totalRowCount-restCount;
            details=totalDetails.subList(start,end);
//            details=(ArrayList)totalDetails.subList(start,end);
        }
        return details;
    }

    /**
     * 获取下一页
     */
    public int getNextPage() {
        if (this.currentPage != this.totalPage) {
            return ++currentPage;
        }
        return -1;
    }

    /**
     * 获取上一页
     */
    public int getPreviousPage() {
        if (this.currentPage != 1) {
            return --currentPage;
        }
        return -1;
    }

    /**
     * 获取最后一页
     */
    public int getLastPage() {
        return this.totalPage;
    }

    /**
     * 获取第一页
     */
    public int getFirstPage() {
        return 1;
    }

    /**
     * 获取总页数
     */
    public int getTotolPage() {
        return this.totalPage;
    }

    /**
     * 获取当前页
     */
    public int getCurrentPage() {
        return this.currentPage;
    }

    public static void main(String[] args) {
        Findbugs findbugs=new FindbugsService().getFindbugs();
        Pager pager=new Pager(13,findbugs.getHighDetails());
        pager.currentPage=3;
        List<Detail> details=pager.getPageData();
        System.out.println(details.size());
    }

}
