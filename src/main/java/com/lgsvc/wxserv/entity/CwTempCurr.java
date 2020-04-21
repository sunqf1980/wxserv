package com.lgsvc.wxserv.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 *  cw_tempcurr实时温湿度-表的实体类
 *
 * @author sunqf1980@163.com
 */

public class CwTempCurr {
    private String id;
    private Date inTime;
    private Integer flag;
    private Integer customerId;
    private String chx;
    private Double curVal;
    private Integer state;

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
}
