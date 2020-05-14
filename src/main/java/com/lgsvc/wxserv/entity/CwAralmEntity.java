package com.lgsvc.wxserv.entity;

import java.util.Date;

public class CwAralmEntity {
    private Date intime;
    private String format_data;
    private String aobj;
    private String atext;
    private String descript;
    private String devname;
    private Double lowvalue;
    private Double highvalue;

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public String getFormat_data() {
        return format_data;
    }

    public void setFormat_data(String format_data) {
        this.format_data = format_data;
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
}
