package com.lgsvc.wxserv.service;

import com.lgsvc.wxserv.dto.UserExecution;
import com.lgsvc.wxserv.entity.CwUserEntity;

public interface CwUserService {


    /**
     * 通过区域Id获取区域信息
     *
     * @param uId
     * @return
     */
    public UserExecution getCwUserByuId(String userName, String userPasswd);
}
