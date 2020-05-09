package com.lgsvc.wxserv.entity;

import java.util.List;

/**
 * 实时监控-实体类
 * select  a.customerid, a.chx, a.val, a.state, b.descript, b.sortint,b.devname,b.devaddr, b.highvalue, b.lowvalue
 * from
 * cw_tempcurr a, cw_channel b
 * where a.customerid=b.customerid
 * and a.customerid=''
 * and a.chx = b.sortstr
 * 表结构真是一踏糊涂。customerId居然能设计成Int。我晕
 */

public class RealTimeMonitor {
    private Integer customerId;
    private String chx;
    private Double curVal;   //怎么会有这样的结构，晕 当前温度
    private Integer state;
    private List<CwTempCurrEntity> cwTempCurr;
    private List<CwChannelEntity> cwChannel;

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

    public Double getCurVal() {
        return curVal;
    }

    public void setCurVal(Double curVal) {
        this.curVal = curVal;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<CwTempCurrEntity> getCwTempCurr() {
        return cwTempCurr;
    }

    public void setCwTempCurr(List<CwTempCurrEntity> cwTempCurr) {
        this.cwTempCurr = cwTempCurr;
    }

    public List<CwChannelEntity> getCwChannel() {
        return cwChannel;
    }

    public void setCwChannel(List<CwChannelEntity> cwChannel) {
        this.cwChannel = cwChannel;
    }
}
