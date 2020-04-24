package com.lgsvc.wxserv.entity;

/**
 * 设备客户实体类
 *
 * @author sunqf1980@163.com
 */
public class ChxChannelCurEntity {
    private String channel_id;
    private String sortstr;
    private Integer sortint;
    private String descript;
    private Double sv;
    private Double lowvalue;
    private Double highvalue;
    private Double val;
    private Integer state_cur;

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getSortstr() {
        return sortstr;
    }

    public void setSortstr(String sortstr) {
        this.sortstr = sortstr;
    }

    public Integer getSortint() {
        return sortint;
    }

    public void setSortint(Integer sortint) {
        this.sortint = sortint;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
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
}