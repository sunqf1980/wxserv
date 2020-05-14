package com.lgsvc.wxserv.dto;

import com.lgsvc.wxserv.entity.CwAralmEntity;
import com.lgsvc.wxserv.entity.CwUserEntity;
import com.lgsvc.wxserv.enums.ManageEnum;
import com.lgsvc.wxserv.enums.UserEnum;

import java.util.List;

public class UserExecution {
    private int state;

    // 状态标识
    private String stateInfo;

    // 返回结果总条数
    private int count;

    private List<CwUserEntity> userList;
    private CwUserEntity userEntity;


    //无参构造器
    public UserExecution() {
    }

    // 操作失败的时候使用的构造器
    public UserExecution(UserEnum userEnum) {
        this.state = userEnum.getState();
        this.stateInfo = userEnum.getStateInfo();
    }

    // 操作成功的时候使用的构造器
    public UserExecution(UserEnum userEnum, CwUserEntity cwUserEntity) {
        this.state = userEnum.getState();
        this.stateInfo = userEnum.getStateInfo();
        this.userEntity = cwUserEntity;
    }

    public UserExecution(UserEnum userEnum, List<CwUserEntity> userList) {
        this.state = userEnum.getState();
        this.stateInfo = userEnum.getStateInfo();
        this.userList = userList;
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

    public List<CwUserEntity> getUserList() {
        return userList;
    }

    public void setUserList(List<CwUserEntity> userList) {
        this.userList = userList;
    }

    public CwUserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(CwUserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
