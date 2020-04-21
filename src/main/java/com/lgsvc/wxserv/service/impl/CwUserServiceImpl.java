package com.lgsvc.wxserv.service.impl;

import com.lgsvc.wxserv.service.CwUserService;
import com.lgsvc.wxserv.dao.CwUserDao;
import com.lgsvc.wxserv.entity.CwUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CwUserServiceImpl implements CwUserService {
    @Autowired
    private CwUserDao cwUserDao;

    @Override
    public CwUser getCwUserByuId(String uId) {
        return cwUserDao.queryCwUserById(uId);
    }
}
