package com.lgsvc.wxserv.entity;

import java.util.Date;

public class CwAralmEntity {
    private String id;
    private Date intime;
    private Integer flag;
    private Integer customerid;
    private String aobj;
    private String atext;
    private String explain1;
    private String explain2;
    private String explain3;
    private Integer amode;
    private Integer aok;
    private String format_data;

    public String getFormat_data() {
        return format_data;
    }

    public void setFormat_data(String format_data) {
        this.format_data = format_data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getAobj() {
        return aobj;
    }

    public void setAobj(String aobj) {
        this.aobj = aobj;
    }

    public String getAtext() {
        return atext;
    }

    public void setAtext(String atext) {
        this.atext = atext;
    }

    public String getExplain1() {
        return explain1;
    }

    public void setExplain1(String explain1) {
        this.explain1 = explain1;
    }

    public String getExplain2() {
        return explain2;
    }

    public void setExplain2(String explain2) {
        this.explain2 = explain2;
    }

    public String getExplain3() {
        return explain3;
    }

    public void setExplain3(String explain3) {
        this.explain3 = explain3;
    }

    public Integer getAmode() {
        return amode;
    }

    public void setAmode(Integer amode) {
        this.amode = amode;
    }

    public Integer getAok() {
        return aok;
    }

    public void setAok(Integer aok) {
        this.aok = aok;
    }

    @Override
    public String toString() {
        return "CwAralmEntity{" +
                "id='" + id + '\'' +
                ", intime=" + intime +
                ", flag=" + flag +
                ", customerid=" + customerid +
                ", aobj='" + aobj + '\'' +
                ", atext='" + atext + '\'' +
                ", explain1='" + explain1 + '\'' +
                ", explain2='" + explain2 + '\'' +
                ", explain3='" + explain3 + '\'' +
                ", amode=" + amode +
                ", aok=" + aok +
                '}';
    }
}
