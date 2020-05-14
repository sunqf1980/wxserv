package com.lgsvc.wxserv.dto;

import com.lgsvc.wxserv.entity.CwAralmEntity;
import com.lgsvc.wxserv.entity.CwSysLogEntity;
import com.lgsvc.wxserv.enums.ManageEnum;

import java.util.List;

public class MangerAralmExcution {
    private int state;

    // 状态标识
    private String stateInfo;

    // 返回结果总条数
    private int count;

    private List<CwAralmEntity> aralmList;
    private CwAralmEntity aralmEntity;

    //无参构造器
    public MangerAralmExcution() {
    }

    // 操作失败的时候使用的构造器
    public MangerAralmExcution(ManageEnum manageEnum) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
    }

    // 操作成功的时候使用的构造器
    public MangerAralmExcution(ManageEnum manageEnum, CwAralmEntity aralmEntity) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
        this.aralmEntity = aralmEntity;
    }

    public MangerAralmExcution(ManageEnum manageEnum, List<CwAralmEntity> aralmList) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
        this.aralmList = aralmList;
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

    public List<CwAralmEntity> getAralmList() {
        return aralmList;
    }

    public void setAralmList(List<CwAralmEntity> aralmList) {
        this.aralmList = aralmList;
    }

    public CwAralmEntity getAralmEntity() {
        return aralmEntity;
    }

    public void setAralmEntity(CwAralmEntity aralmEntity) {
        this.aralmEntity = aralmEntity;
    }
}
