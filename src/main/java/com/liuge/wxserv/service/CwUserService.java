package com.liuge.wxserv.service;

import com.liuge.wxserv.entity.CwUser;

public interface CwUserService {


    /**
     * 通过区域Id获取区域信息
     *
     * @param uId
     * @return
     */
    CwUser getCwUserByuId(String uId);
}
