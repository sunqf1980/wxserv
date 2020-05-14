package com.lgsvc.wxserv.service.impl;

import com.lgsvc.wxserv.dao.CwAralmDao;
import com.lgsvc.wxserv.dao.CwSysLogDao;
import com.lgsvc.wxserv.dao.TbSysResourceDao;
import com.lgsvc.wxserv.dao.TbWarnInfoDao;
import com.lgsvc.wxserv.dto.ManageRecourcceExecution;
import com.lgsvc.wxserv.dto.ManageSysLogExecution;
import com.lgsvc.wxserv.dto.MangerAralmExcution;
import com.lgsvc.wxserv.dto.TbWangInfoExecution;
import com.lgsvc.wxserv.entity.CwAralmEntity;
import com.lgsvc.wxserv.entity.CwSysLogEntity;
import com.lgsvc.wxserv.entity.TbSysResourceEntity;
import com.lgsvc.wxserv.enums.ManageEnum;
import com.lgsvc.wxserv.service.ManageInfoService;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageInfoServiceImpl implements ManageInfoService{
    @Autowired
    TbSysResourceDao tbSysResourceDao;

    @Autowired
    CwSysLogDao cwSysLogDao;

    @Autowired
    TbWarnInfoDao tbWarnInfoDao;

    @Autowired
    CwAralmDao cwAralmDao;

    private final static Logger LOG = LoggerFactory.getLogger(ManageInfoServiceImpl.class);

    @Override
    public ManageRecourcceExecution manageResourceinfoList(@NotNull String sys_name) {
        ManageRecourcceExecution se = new ManageRecourcceExecution();
        //客户的Id怎么会为负数呢？主要检查integer的判断
        if (sys_name.equals(""))  {
            se.setState(ManageEnum.NULL_PARAMS.getState());
            se.setStateInfo(ManageEnum.NULL_PARAMS.getStateInfo());
            throw new RuntimeException();
        }

        int count = tbSysResourceDao.queryTbSysResourceListCount(sys_name);
        if(count < 0){
            se.setState(ManageEnum.INNER_ERROR.getState());
            se.setStateInfo(ManageEnum.INNER_ERROR.getStateInfo());
            throw new RuntimeException();
        }
        List<TbSysResourceEntity> resourceList = tbSysResourceDao.queryTbSysResourceList(sys_name);
        if (resourceList != null) {
            se.setTbResourceList(resourceList);
            se.setCount(count);
            se.setState(ManageEnum.SUCCESS.getState());
            se.setStateInfo(ManageEnum.SUCCESS.getStateInfo());
        } else {
            se.setState(ManageEnum.INNER_ERROR.getState());
            se.setStateInfo(ManageEnum.INNER_ERROR.getStateInfo());
        }
        return se;
    }

    @Override
    public ManageSysLogExecution manageSysLogList(@NotNull Integer customerId, Integer pageIndex, Integer pageSize) {
        ManageSysLogExecution se = new ManageSysLogExecution();

        //客户的Id怎么会为负数呢？主要检查integer的判断
        if (customerId.intValue() <= 0 )  {
            se.setState(ManageEnum.NULL_CUSTOMID.getState());
            se.setStateInfo(ManageEnum.NULL_CUSTOMID.getStateInfo());
            throw new RuntimeException();
        }


        int count = cwSysLogDao.queryCwSysLogListCount(customerId);
        if(count < 0){
            se.setState(ManageEnum.INNER_ERROR.getState());
            se.setStateInfo(ManageEnum.INNER_ERROR.getStateInfo());
            throw new RuntimeException();
        }
        List<CwSysLogEntity> sysLogList = cwSysLogDao.queryCwSysLogList(customerId,pageIndex,pageSize);
        if (sysLogList != null) {
            se.setCwSyslogList(sysLogList);
            se.setCount(count);
            se.setState(ManageEnum.SUCCESS.getState());
            se.setStateInfo(ManageEnum.SUCCESS.getStateInfo());
        } else {
            se.setState(ManageEnum.INNER_ERROR.getState());
            se.setStateInfo(ManageEnum.INNER_ERROR.getStateInfo());
        }
        return se;
    }

    @Override
    public TbWangInfoExecution manageWarnInfoListCount(Integer customerId) {
        TbWangInfoExecution se = new TbWangInfoExecution();

        //客户的Id怎么会为负数呢？主要检查integer的判断
        if (customerId.intValue() <= 0 )  {
            LOG.error("交易chx_curr_channel，上送的customer_id为空"+customerId);
            se.setState(ManageEnum.NULL_CUSTOMID.getState());
            se.setStateInfo(ManageEnum.NULL_CUSTOMID.getStateInfo());
            throw new RuntimeException();
        }

        String customer_id=customerId.toString();

        return se;
    }

    @Override
    public MangerAralmExcution manageAralmList(Integer customerId, Integer pageIndex, Integer pageSize) {
        MangerAralmExcution se = new MangerAralmExcution();

        if (customerId.intValue() <= 0 )  {
            LOG.error("交易chx_curr_channel，上送的customer_id为空"+customerId);
            se.setState(ManageEnum.NULL_CUSTOMID.getState());
            se.setStateInfo(ManageEnum.NULL_CUSTOMID.getStateInfo());
            throw new RuntimeException();
        }

        if (pageIndex < 0 || pageSize <= 0 ){
            LOG.error("上送的交易参数错误 :"+customerId);
            se.setState(ManageEnum.NULL_PARAMS.getState());
            se.setStateInfo(ManageEnum.NULL_PARAMS.getStateInfo());
            throw new RuntimeException();
        }

        int count = cwAralmDao.queryCwAralmListCount(customerId);
        if(count < 0){
            se.setState(ManageEnum.INNER_ERROR.getState());
            se.setStateInfo(ManageEnum.INNER_ERROR.getStateInfo());
            throw new RuntimeException();
        }
        List<CwAralmEntity> aralmList = cwAralmDao.queryCwAralmList(customerId,pageIndex,pageSize);
        if (aralmList != null) {
            se.setAralmList(aralmList);
            se.setCount(count);
            se.setState(ManageEnum.SUCCESS.getState());
            se.setStateInfo(ManageEnum.SUCCESS.getStateInfo());
        } else {
            se.setState(ManageEnum.INNER_ERROR.getState());
            se.setStateInfo(ManageEnum.INNER_ERROR.getStateInfo());
        }

        return se;
    }

}
