package com.lgsvc.wxserv.entity;


import java.util.Date;


public class CwUserEntity {
    private String id;
    private Date inTime;
    private Integer flag;
    private Integer customerId;
    private String uId;
    private String upWd;
    private String uName;
    private String uPhone;
    private String uEmail;
    private String uWatch;
    private String uExplain;
    private String uMemo;
    private String canDo;

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

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getUpWd() {
        return upWd;
    }

    public void setUpWd(String upWd) {
        this.upWd = upWd;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuWatch() {
        return uWatch;
    }

    public void setuWatch(String uWatch) {
        this.uWatch = uWatch;
    }

    public String getuExplain() {
        return uExplain;
    }

    public void setuExplain(String uExplain) {
        this.uExplain = uExplain;
    }

    public String getuMemo() {
        return uMemo;
    }

    public void setuMemo(String uMemo) {
        this.uMemo = uMemo;
    }

    public String getCanDo() {
        return canDo;
    }

    public void setCanDo(String canDo) {
        this.canDo = canDo;
    }
}
