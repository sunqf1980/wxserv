package com.liuge.wxserv.entity;

import java.util.Date;
import java.util.List;

public class CwTempCurr {
    private String id;
    private Date inTime;
    private Integer flag;
    private Integer customerId;
    private String chx;
    private Double curVal;   //怎么会有这样的结构，晕 当前温度
    private Integer state;
    private List<CwChannel> cwChannel;

    public List<CwChannel> getCwChannel() {
        return cwChannel;
    }

    public void setCwChannel(List<CwChannel> cwChannel) {
        this.cwChannel = cwChannel;
    }

    public Double getCurVal() {
        return curVal;
    }

    public void setCurVal(Double curVal) {
        this.curVal = curVal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getChx() {
        return chx;
    }

    public void setChx(String chx) {
        this.chx = chx;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "CwTempcurr{" +
                "id='" + id + '\'' +
                ", inTime=" + inTime +
                ", flag=" + flag +
                ", customerId=" + customerId +
                ", chx='" + chx + '\'' +
                ", curVal=" + curVal +
                ", state=" + state +
                '}';
    }
}
