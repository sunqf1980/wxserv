package com.lgsvc.wxserv.entity;


/**
 * 设备客户实体类
 *
 * @author sunqf1980@163.com
 */
public class ChannelCustomInfoEntity {
    private String maxDate;
    private String sortstr;
    private String descript;
    private String devname;
    private String devaddr;
    private Double sv;
    private Double lowvalue;
    private Double highvalue;
    private Double val;
    private Integer state_cur;
    private Integer state;
    private String formatData;

    public String getMaxDate() {
        return maxDate;
    }

    public void setMaxDate(String maxDate) {
        this.maxDate = maxDate;
    }

    public String getSortstr() {
        return sortstr;
    }

    public void setSortstr(String sortstr) {
        this.sortstr = sortstr;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        this.devname = devname;
    }

    public String getDevaddr() {
        return devaddr;
    }

    public void setDevaddr(String devaddr) {
        this.devaddr = devaddr;
    }

    public Double getSv() {
        return sv;
    }

    public void setSv(Double sv) {
        this.sv = sv;
    }

    public Double getLowvalue() {
        return lowvalue;
    }

    public void setLowvalue(Double lowvalue) {
        this.lowvalue = lowvalue;
    }

    public Double getHighvalue() {
        return highvalue;
    }

    public void setHighvalue(Double highvalue) {
        this.highvalue = highvalue;
    }

    public Double getVal() {
        return val;
    }

    public void setVal(Double val) {
        this.val = val;
    }

    public Integer getState_cur() {
        return state_cur;
    }

    public void setState_cur(Integer state_cur) {
        this.state_cur = state_cur;
    }

    public String getFormatData() {
        return formatData;
    }

    public void setFormatData(String formatData) {
        this.formatData = formatData;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
