package com.lgsvc.wxserv.dto;

import com.lgsvc.wxserv.entity.ChxChannelCurEntity;
import com.lgsvc.wxserv.entity.CwTempTempEntity;
import com.lgsvc.wxserv.enums.ChannelHisEnum;
import com.lgsvc.wxserv.enums.ChxCurStateEnum;

import java.util.List;

public class ChannelHisExecution {
    private int state;

    // 状态标识
    private String stateInfo;

    // 返回结果总条数
    private int count;

    private List<CwTempTempEntity> chxHisList;
    private CwTempTempEntity chxHisEntity;

    //无参构造器
    public ChannelHisExecution() {
    }

    // 操作失败的时候使用的构造器
    public ChannelHisExecution(ChannelHisEnum channelHisEnum) {
        this.state = channelHisEnum.getState();
        this.stateInfo = channelHisEnum.getStateInfo();
    }

    // 操作成功的时候使用的构造器
    public ChannelHisExecution(ChannelHisEnum channelHisEnum, CwTempTempEntity cwTempTempEntity) {
        this.state = channelHisEnum.getState();
        this.stateInfo = channelHisEnum.getStateInfo();
        this.chxHisEntity = cwTempTempEntity;
    }

    public ChannelHisExecution(ChannelHisEnum channelHisEnum, List<CwTempTempEntity> cwTempTempList) {
        this.state = channelHisEnum.getState();
        this.stateInfo = channelHisEnum.getStateInfo();
        this.chxHisList = cwTempTempList;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<CwTempTempEntity> getChxHisList() {
        return chxHisList;
    }

    public void setChxHisList(List<CwTempTempEntity> chxHisList) {
        this.chxHisList = chxHisList;
    }

    public CwTempTempEntity getChxHisEntity() {
        return chxHisEntity;
    }

    public void setChxHisEntity(CwTempTempEntity chxHisEntity) {
        this.chxHisEntity = chxHisEntity;
    }
}
