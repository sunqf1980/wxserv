package com.lgsvc.wxserv.service.impl;

import com.lgsvc.wxserv.dto.ManageRecourcceExecution;
import com.lgsvc.wxserv.dto.UserExecution;
import com.lgsvc.wxserv.entity.TbSysResourceEntity;
import com.lgsvc.wxserv.enums.ManageEnum;
import com.lgsvc.wxserv.enums.UserEnum;
import com.lgsvc.wxserv.exceptions.userManagerException;
import com.lgsvc.wxserv.service.CwUserService;
import com.lgsvc.wxserv.dao.CwUserDao;
import com.lgsvc.wxserv.entity.CwUserEntity;
import com.lgsvc.wxserv.util.ValidationUtil;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CwUserServiceImpl implements CwUserService {
    @Autowired
    private CwUserDao cwUserDao;

    private final static Logger LOG = LoggerFactory.getLogger(CwUserServiceImpl.class);


    @Override
    public UserExecution getCwUserByuId(String userName, String userPasswd) {
        UserExecution se = new UserExecution();

        if (ValidationUtil.isEmpty(userName) && ValidationUtil.isEmpty(userPasswd)) {
            se.setState(UserEnum.NULL_PARAMS.getState());
            se.setStateInfo(UserEnum.NULL_PARAMS.getStateInfo());
            return se;
        }

        int count = cwUserDao.queryCwUserByIdCount(userName);
        if (count < 0) {
            se.setState(UserEnum.INNER_ERROR.getState());
            se.setStateInfo(UserEnum.INNER_ERROR.getStateInfo());
            return se;
        }

        if (count == 0) {
            se.setState(UserEnum.NULL_DATA.getState());
            se.setStateInfo(UserEnum.NULL_DATA.getStateInfo());
            return se;
        }

        CwUserEntity userEntity = cwUserDao.queryCwUserById(userName);
        if (userEntity != null) {
            if (!userEntity.getUpWd().equals(userPasswd)) {
                se.setState(UserEnum.ERR_PASSWD.getState());
                se.setStateInfo(UserEnum.ERR_PASSWD.getStateInfo());
                return se;
            }
            se.setUserEntity(userEntity);
            se.setCount(count);
            se.setState(UserEnum.SUCCESS.getState());
            se.setStateInfo(UserEnum.SUCCESS.getStateInfo());
        } else {
            se.setState(UserEnum.INNER_ERROR.getState());
            se.setStateInfo(UserEnum.INNER_ERROR.getStateInfo());
        }
        return se;
    }

}
