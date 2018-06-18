package codeflow.codeflow.bean;

import java.util.ArrayList;

/**
 * @author zhenghang
 * @date 18-6-17 下午5:04
 */
public class Findbugs {
    private String total;
    private String high;
    private String normal;
    private String low;

    private ArrayList<Detail> highDetails;
    private ArrayList<Detail> normalDetails;
    private ArrayList<Detail> lowDetails;

    public ArrayList<Detail> getHighDetails() {
        return highDetails;
    }

    public void setHighDetails(ArrayList<Detail> highDetails) {
        this.highDetails = highDetails;
    }

    public ArrayList<Detail> getNormalDetails() {
        return normalDetails;
    }

    public void setNormalDetails(ArrayList<Detail> normalDetails) {
        this.normalDetails = normalDetails;
    }

    public ArrayList<Detail> getLowDetails() {
        return lowDetails;
    }

    public void setLowDetails(ArrayList<Detail> lowDetails) {
        this.lowDetails = lowDetails;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }
}
