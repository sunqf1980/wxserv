package com.lgsvc.wxserv.dto;

import com.lgsvc.wxserv.entity.TbSysResourceEntity;
import com.lgsvc.wxserv.enums.ManageEnum;

import java.util.List;

public class ManageRecourcceExecution {

    private int state;

    // 状态标识
    private String stateInfo;

    // 返回结果总条数
    private int count;

    private List<TbSysResourceEntity> tbResourceList;
    private TbSysResourceEntity tbResourceEntity;

    //无参构造器
    public ManageRecourcceExecution() {
    }

    // 操作失败的时候使用的构造器
    public ManageRecourcceExecution(ManageEnum manageEnum) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
    }

    // 操作成功的时候使用的构造器
    public ManageRecourcceExecution(ManageEnum manageEnum, TbSysResourceEntity tbSysResourceEntity) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
        this.tbResourceEntity = tbSysResourceEntity;
    }

    public ManageRecourcceExecution(ManageEnum manageEnum, List<TbSysResourceEntity> tbResourceList) {
        this.state = manageEnum.getState();
        this.stateInfo = manageEnum.getStateInfo();
        this.tbResourceList = tbResourceList;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public int getCount() {
        return count;
    }

    public List<TbSysResourceEntity> getTbResourceList() {
        return tbResourceList;
    }

    public TbSysResourceEntity getTbResourceEntity() {
        return tbResourceEntity;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setTbResourceList(List<TbSysResourceEntity> tbResourceList) {
        this.tbResourceList = tbResourceList;
    }

    public void setTbResourceEntity(TbSysResourceEntity tbResourceEntity) {
        this.tbResourceEntity = tbResourceEntity;
    }
}
