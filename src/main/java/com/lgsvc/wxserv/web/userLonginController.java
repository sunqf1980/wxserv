package com.lgsvc.wxserv.web;

import com.lgsvc.wxserv.dto.ManageRecourcceExecution;
import com.lgsvc.wxserv.dto.UserExecution;
import com.lgsvc.wxserv.service.CwUserService;
import com.lgsvc.wxserv.util.ValidationUtil;
import com.lgsvc.wxserv.entity.CwUserEntity;
import com.lgsvc.wxserv.util.HttpServletRequestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class userLonginController {
    @Autowired
    private CwUserService cwUserService;

    private final static Logger LOG = LoggerFactory.getLogger(userLonginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> userLoginCheck(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();

        String userNumId = HttpServletRequestUtil.getString(request, "userName");
        String userPasswd = HttpServletRequestUtil.getString(request, "userPassword");

       System.out.print("传进的参数"+userNumId);
        try {
            // 获取区域列表信息
            UserExecution se = cwUserService.getCwUserByuId(userNumId, userPasswd);
            if(se.getUserEntity() == null){
                modelMap.put("success", false);
                modelMap.put("errMsg", se.getStateInfo());
                return modelMap;
            }
            modelMap.put("success", true);
            modelMap.put("errMsg", se.getStateInfo());
            modelMap.put("UserInfo", se.getUserEntity());
            modelMap.put("count", se.getCount());
            System.out.print("已经返回errMsg");
            return modelMap;
        } catch (Exception e) {
            /* 出现异常信息,不能将异常抛给客户 */
            modelMap.put("success", false);
            modelMap.put("errMsg", "内部错误，请联系系统管理员【database is err]");
            LOG.error(e.getMessage());
        }
        return modelMap;
    }
}


