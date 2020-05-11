package com.lgsvc.wxserv.entity;

import java.util.Date;

/**
 * 设备客户实体类
 *
 * @author sunqf1980@163.com
 */
public class ChxChannelCurEntity {
    private String channel_id;
    private Date inTime;
    private String sortstr;
    private Integer sortint;
    private String descript;
    private Double sv;
    private Double lowvalue;
    private Double highvalue;
    private Double val;
    private Integer state_cur;
    private String format_data;


    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
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


    public String getFormat_data() {
        return format_data;
    }

    public void setFormat_data(String format_data) {
        this.format_data = format_data;
    }

    @Override
    public String toString() {
        return "ChxChannelCurEntity{" +
                "channel_id='" + channel_id + '\'' +
                ", inTime=" + inTime +
                ", sortstr='" + sortstr + '\'' +
                ", sortint=" + sortint +
                ", descript='" + descript + '\'' +
                ", sv=" + sv +
                ", lowvalue=" + lowvalue +
                ", highvalue=" + highvalue +
                ", val=" + val +
                ", state_cur=" + state_cur +
                ", format_data='" + format_data + '\'' +
                '}';
    }
}
