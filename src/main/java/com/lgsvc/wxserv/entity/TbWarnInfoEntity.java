package com.lgsvc.wxserv.entity;

import java.util.Date;

public class TbWarnInfoEntity {

    private Integer warnId;
    private Integer customerId;
    private String channelId;
    private String channelDesc;
    private Integer warnLev;
    private Date   curDatatime;
    private String formatData;
    private String customPhone;
    private String customWxchat;
    private String wranStat;
    private Integer frequencyTime;
    private String warnDesc;
    private String warnInfo;
    private Integer isShowFront;
    private Integer isSendWxchat;
    private String xwResErrCode;
    private String wxResErrMsg;

    public Integer getWarnId() {
        return warnId;
    }

    public void setWarnId(Integer warnId) {
        this.warnId = warnId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getWarnLev() {
        return warnLev;
    }

    public void setWarnLev(Integer warnLev) {
        this.warnLev = warnLev;
    }

    public Date getCurDatatime() {
        return curDatatime;
    }

    public void setCurDatatime(Date curDatatime) {
        this.curDatatime = curDatatime;
    }

    public String getFormatData() {
        return formatData;
    }

    public void setFormatData(String formatData) {
        this.formatData = formatData;
    }

    public String getCustomPhone() {
        return customPhone;
    }

    public void setCustomPhone(String customPhone) {
        this.customPhone = customPhone;
    }

    public String getCustomWxchat() {
        return customWxchat;
    }

    public void setCustomWxchat(String customWxchat) {
        this.customWxchat = customWxchat;
    }

    public String getWranStat() {
        return wranStat;
    }

    public void setWranStat(String wranStat) {
        this.wranStat = wranStat;
    }

    public Integer getFrequencyTime() {
        return frequencyTime;
    }

    public void setFrequencyTime(Integer frequencyTime) {
        this.frequencyTime = frequencyTime;
    }

    public String getWarnDesc() {
        return warnDesc;
    }

    public void setWarnDesc(String warnDesc) {
        this.warnDesc = warnDesc;
    }

    public String getWarnInfo() {
        return warnInfo;
    }

    public void setWarnInfo(String warnInfo) {
        this.warnInfo = warnInfo;
    }

    public Integer getIsShowFront() {
        return isShowFront;
    }

    public void setIsShowFront(Integer isShowFront) {
        this.isShowFront = isShowFront;
    }

    public Integer getIsSendWxchat() {
        return isSendWxchat;
    }

    public void setIsSendWxchat(Integer isSendWxchat) {
        this.isSendWxchat = isSendWxchat;
    }

    public String getXwResErrCode() {
        return xwResErrCode;
    }

    public void setXwResErrCode(String xwResErrCode) {
        this.xwResErrCode = xwResErrCode;
    }

    public String getWxResErrMsg() {
        return wxResErrMsg;
    }

    public void setWxResErrMsg(String wxResErrMsg) {
        this.wxResErrMsg = wxResErrMsg;
    }

    public String getChannelDesc() {
        return channelDesc;
    }

    public void setChannelDesc(String channelDesc) {
        this.channelDesc = channelDesc;
    }

    @Override
    public String toString() {
        return "TbWarnInfoEntity{" +
                "warnId=" + warnId +
                ", customerId=" + customerId +
                ", channelId='" + channelId + '\'' +
                ", channelDesc='" + channelDesc + '\'' +
                ", warnLev=" + warnLev +
                ", curDatatime=" + curDatatime +
                ", formatData='" + formatData + '\'' +
                ", customPhone='" + customPhone + '\'' +
                ", customWxchat='" + customWxchat + '\'' +
                ", wranStat='" + wranStat + '\'' +
                ", frequencyTime=" + frequencyTime +
                ", warnDesc='" + warnDesc + '\'' +
                ", warnInfo='" + warnInfo + '\'' +
                ", isShowFront=" + isShowFront +
                ", isSendWxchat=" + isSendWxchat +
                ", xwResErrCode='" + xwResErrCode + '\'' +
                ", wxResErrMsg='" + wxResErrMsg + '\'' +
                '}';
    }
}
