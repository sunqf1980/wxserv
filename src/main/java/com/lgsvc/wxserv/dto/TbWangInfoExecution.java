package com.lgsvc.wxserv.dto;

import com.lgsvc.wxserv.entity.CwSysLogEntity;
import com.lgsvc.wxserv.entity.TbWarnInfoEntity;
import com.lgsvc.wxserv.enums.ManageEnum;

import java.util.List;

public class TbWangInfoExecution {
    private int state;

    // 状态标识
    private String stateInfo;

    // 返回结果总条数
    private int count;

    private List<TbWarnInfoEntity> tbWarnInfoList;
    private TbWarnInfoEntity tbWarnInfoEntity;

    //无参构造器
    public TbWangInfoExecution() {
    }

    // 操作失败的时候使用的构造器
    public TbWangInfoExecution(ManageEnum manageEnum) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
    }

    // 操作成功的时候使用的构造器
    public TbWangInfoExecution(ManageEnum manageEnum, TbWarnInfoEntity tbWarnInfoEntity) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
        this.tbWarnInfoEntity = tbWarnInfoEntity;
    }

    public TbWangInfoExecution(ManageEnum manageEnum, List<TbWarnInfoEntity> tbWarnInfoList) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
        this.tbWarnInfoList = tbWarnInfoList;
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

    public List<TbWarnInfoEntity> getTbWarnInfoList() {
        return tbWarnInfoList;
    }

    public void setTbWarnInfoList(List<TbWarnInfoEntity> tbWarnInfoList) {
        this.tbWarnInfoList = tbWarnInfoList;
    }

    public TbWarnInfoEntity getTbWarnInfoEntity() {
        return tbWarnInfoEntity;
    }

    public void setTbWarnInfoEntity(TbWarnInfoEntity tbWarnInfoEntity) {
        this.tbWarnInfoEntity = tbWarnInfoEntity;
    }
}
