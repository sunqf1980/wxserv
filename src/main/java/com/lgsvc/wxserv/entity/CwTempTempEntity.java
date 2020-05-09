package com.lgsvc.wxserv.entity;

import java.util.Date;

public class CwTempTempEntity {
    private Integer customer_id;
    private Date inTime;
    private String flag;
    private Double val;
    private Double sv;
    private Double lowvalue;
    private Double highvalue;
    private String format_data;

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Double getVal() {
        return val;
    }

    public void setVal(Double val) {
        this.val = val;
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

    public String getFormat_data() {
        return format_data;
    }

    public void setFormat_data(String format_data) {
        this.format_data = format_data;
    }

    @Override
    public String toString() {
        return "CwTempTempEntity{" +
                "customer_id=" + customer_id +
                ", inTime=" + inTime +
                ", flag='" + flag + '\'' +
                ", val=" + val +
                '}';
    }
}
