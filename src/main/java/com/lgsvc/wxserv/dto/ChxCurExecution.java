package com.lgsvc.wxserv.dto;

import com.lgsvc.wxserv.entity.ChannelCustomInfoEntity;
import com.lgsvc.wxserv.entity.ChxChannelCurEntity;
import com.lgsvc.wxserv.enums.ChannelCustomStateEnum;
import com.lgsvc.wxserv.enums.ChxCurStateEnum;

import java.util.List;

public class ChxCurExecution {
    private int state;

    // 状态标识
    private String stateInfo;

    // 返回结果总条数
    private int count;

    private List<ChxChannelCurEntity> chxCurList;
    private ChxChannelCurEntity chxCurEntity;

    //无参构造器
    public ChxCurExecution() {
    }

    // 操作失败的时候使用的构造器
    public ChxCurExecution(ChxCurStateEnum chxCurStateEnum) {
        this.state = chxCurStateEnum.getState();
        this.stateInfo = chxCurStateEnum.getStateInfo();
    }

    // 操作成功的时候使用的构造器
    public ChxCurExecution(ChxCurStateEnum chxCurStateEnum, ChxChannelCurEntity chxCurEntity) {
        this.state = chxCurStateEnum.getState();
        this.stateInfo = chxCurStateEnum.getStateInfo();
        this.chxCurEntity=chxCurEntity;
    }

    public ChxCurExecution(ChxCurStateEnum chxCurStateEnum, List<ChxChannelCurEntity> chxCurEntityList) {
        this.state = chxCurStateEnum.getState();
        this.stateInfo = chxCurStateEnum.getStateInfo();
        this.chxCurList=chxCurEntityList;
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

    public List<ChxChannelCurEntity> getChxCurList() {
        return chxCurList;
    }

    public void setChxCurList(List<ChxChannelCurEntity> chxCurList) {
        this.chxCurList = chxCurList;
    }

    public ChxChannelCurEntity getChxCurEntity() {
        return chxCurEntity;
    }

    public void setChxCurEntity(ChxChannelCurEntity chxCurEntity) {
        this.chxCurEntity = chxCurEntity;
    }
}
