package com.liuge.wxserv.service.impl;

import com.liuge.wxserv.dao.CwUserDao;
import com.liuge.wxserv.entity.CwUser;
import com.liuge.wxserv.service.CwUserService;
import com.liuge.wxserv.util.ValidationUtil;
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
