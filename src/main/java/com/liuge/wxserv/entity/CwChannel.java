package com.liuge.wxserv.entity;

import java.util.Date;
import java.util.List;

public class CwChannel {
    private String id;
    private Date inTime;
    private Integer flag;
    private Integer customerId;
    private String sortstr;
    private Integer sortint;
    private String descript;
    private String devname;
    private String devaddr;
    private Integer sortid;
    private Integer gatherway;
    private Integer comnum;
    private Double sv;
    private Double lowvalue;
    private Double highvalue;
    private Double l2;
    private Double h2;
    private Integer use2;
    private Double xa;
    private Double xb;
    private Integer state;
    private String agroup;
    private Integer delayl;
    private Integer delayh;
    private Integer dlsms;
    private Integer dhsms;
    private Integer dlemail;
    private Integer dhemail;
    private Integer dlphone;
    private Integer dhphone;
    private Integer dlwx;
    private Integer dhwx;
    private Integer d2l;
    private Integer d2h;
    private Integer d2lsms;
    private Integer d2hsms;
    private Integer d2lemail;
    private Integer d2hemail;
    private Integer d2lphone;
    private Integer d2hphone;
    private Integer d2lwx;
    private Integer d2hwx;
    private Integer gdelay;
    private Integer gmaxerr;
    private String simno;
    private String ip;
    private String ncode;
    private Integer flag1;
    private Integer flag2;
    private Integer flag3;
    private String bz;
    private String sm;
    private List<CwTempCurr> cwTempCurr;


    public List<CwTempCurr> getCwTempCurr() {
        return cwTempCurr;
    }

    public void setCwTempCurr(List<CwTempCurr> cwTempCurr) {
        this.cwTempCurr = cwTempCurr;
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

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    public Integer getGatherway() {
        return gatherway;
    }

    public void setGatherway(Integer gatherway) {
        this.gatherway = gatherway;
    }

    public Integer getComnum() {
        return comnum;
    }

    public void setComnum(Integer comnum) {
        this.comnum = comnum;
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

    public Double getL2() {
        return l2;
    }

    public void setL2(Double l2) {
        this.l2 = l2;
    }

    public Double getH2() {
        return h2;
    }

    public void setH2(Double h2) {
        this.h2 = h2;
    }

    public Integer getUse2() {
        return use2;
    }

    public void setUse2(Integer use2) {
        this.use2 = use2;
    }

    public Double getXa() {
        return xa;
    }

    public void setXa(Double xa) {
        this.xa = xa;
    }

    public Double getXb() {
        return xb;
    }

    public void setXb(Double xb) {
        this.xb = xb;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAgroup() {
        return agroup;
    }

    public void setAgroup(String agroup) {
        this.agroup = agroup;
    }

    public Integer getDelayl() {
        return delayl;
    }

    public void setDelayl(Integer delayl) {
        this.delayl = delayl;
    }

    public Integer getDelayh() {
        return delayh;
    }

    public void setDelayh(Integer delayh) {
        this.delayh = delayh;
    }

    public Integer getDlsms() {
        return dlsms;
    }

    public void setDlsms(Integer dlsms) {
        this.dlsms = dlsms;
    }

    public Integer getDhsms() {
        return dhsms;
    }

    public void setDhsms(Integer dhsms) {
        this.dhsms = dhsms;
    }

    public Integer getDlemail() {
        return dlemail;
    }

    public void setDlemail(Integer dlemail) {
        this.dlemail = dlemail;
    }

    public Integer getDhemail() {
        return dhemail;
    }

    public void setDhemail(Integer dhemail) {
        this.dhemail = dhemail;
    }

    public Integer getDlphone() {
        return dlphone;
    }

    public void setDlphone(Integer dlphone) {
        this.dlphone = dlphone;
    }

    public Integer getDhphone() {
        return dhphone;
    }

    public void setDhphone(Integer dhphone) {
        this.dhphone = dhphone;
    }

    public Integer getDlwx() {
        return dlwx;
    }

    public void setDlwx(Integer dlwx) {
        this.dlwx = dlwx;
    }

    public Integer getDhwx() {
        return dhwx;
    }

    public void setDhwx(Integer dhwx) {
        this.dhwx = dhwx;
    }

    public Integer getD2l() {
        return d2l;
    }

    public void setD2l(Integer d2l) {
        this.d2l = d2l;
    }

    public Integer getD2h() {
        return d2h;
    }

    public void setD2h(Integer d2h) {
        this.d2h = d2h;
    }

    public Integer getD2lsms() {
        return d2lsms;
    }

    public void setD2lsms(Integer d2lsms) {
        this.d2lsms = d2lsms;
    }

    public Integer getD2hsms() {
        return d2hsms;
    }

    public void setD2hsms(Integer d2hsms) {
        this.d2hsms = d2hsms;
    }

    public Integer getD2lemail() {
        return d2lemail;
    }

    public void setD2lemail(Integer d2lemail) {
        this.d2lemail = d2lemail;
    }

    public Integer getD2hemail() {
        return d2hemail;
    }

    public void setD2hemail(Integer d2hemail) {
        this.d2hemail = d2hemail;
    }

    public Integer getD2lphone() {
        return d2lphone;
    }

    public void setD2lphone(Integer d2lphone) {
        this.d2lphone = d2lphone;
    }

    public Integer getD2hphone() {
        return d2hphone;
    }

    public void setD2hphone(Integer d2hphone) {
        this.d2hphone = d2hphone;
    }

    public Integer getD2lwx() {
        return d2lwx;
    }

    public void setD2lwx(Integer d2lwx) {
        this.d2lwx = d2lwx;
    }

    public Integer getD2hwx() {
        return d2hwx;
    }

    public void setD2hwx(Integer d2hwx) {
        this.d2hwx = d2hwx;
    }

    public Integer getGdelay() {
        return gdelay;
    }

    public void setGdelay(Integer gdelay) {
        this.gdelay = gdelay;
    }

    public Integer getGmaxerr() {
        return gmaxerr;
    }

    public void setGmaxerr(Integer gmaxerr) {
        this.gmaxerr = gmaxerr;
    }

    public String getSimno() {
        return simno;
    }

    public void setSimno(String simno) {
        this.simno = simno;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNcode() {
        return ncode;
    }

    public void setNcode(String ncode) {
        this.ncode = ncode;
    }

    public Integer getFlag1() {
        return flag1;
    }

    public void setFlag1(Integer flag1) {
        this.flag1 = flag1;
    }

    public Integer getFlag2() {
        return flag2;
    }

    public void setFlag2(Integer flag2) {
        this.flag2 = flag2;
    }

    public Integer getFlag3() {
        return flag3;
    }

    public void setFlag3(Integer flag3) {
        this.flag3 = flag3;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    @Override
    public String toString() {
        return "CwChannel{" +
                "id='" + id + '\'' +
                ", inTime=" + inTime +
                ", flag=" + flag +
                ", customerId=" + customerId +
                ", sortstr='" + sortstr + '\'' +
                ", sortint=" + sortint +
                ", descript='" + descript + '\'' +
                ", devname='" + devname + '\'' +
                ", devaddr='" + devaddr + '\'' +
                ", sortid=" + sortid +
                ", gatherway=" + gatherway +
                ", comnum=" + comnum +
                ", sv=" + sv +
                ", lowvalue=" + lowvalue +
                ", highvalue=" + highvalue +
                ", l2=" + l2 +
                ", h2=" + h2 +
                ", use2=" + use2 +
                ", xa=" + xa +
                ", xb=" + xb +
                ", state=" + state +
                ", agroup='" + agroup + '\'' +
                ", delayl=" + delayl +
                ", delayh=" + delayh +
                ", dlsms=" + dlsms +
                ", dhsms=" + dhsms +
                ", dlemail=" + dlemail +
                ", dhemail=" + dhemail +
                ", dlphone=" + dlphone +
                ", dhphone=" + dhphone +
                ", dlwx=" + dlwx +
                ", dhwx=" + dhwx +
                ", d2l=" + d2l +
                ", d2h=" + d2h +
                ", d2lsms=" + d2lsms +
                ", d2hsms=" + d2hsms +
                ", d2lemail=" + d2lemail +
                ", d2hemail=" + d2hemail +
                ", d2lphone=" + d2lphone +
                ", d2hphone=" + d2hphone +
                ", d2lwx=" + d2lwx +
                ", d2hwx=" + d2hwx +
                ", gdelay=" + gdelay +
                ", gmaxerr=" + gmaxerr +
                ", simno='" + simno + '\'' +
                ", ip='" + ip + '\'' +
                ", ncode='" + ncode + '\'' +
                ", flag1=" + flag1 +
                ", flag2=" + flag2 +
                ", flag3=" + flag3 +
                ", bz='" + bz + '\'' +
                ", sm='" + sm + '\'' +
                '}';
    }
}
