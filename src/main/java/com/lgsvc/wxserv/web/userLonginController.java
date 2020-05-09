package com.lgsvc.wxserv.web;

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
        String ErrMsg="";
        /* 获取输入的 登陆id*/
        System.out.print(request);
        String userNumId = HttpServletRequestUtil.getString(request, "userName");
        String userPasswd = HttpServletRequestUtil.getString(request, "userPassword");
        if (ValidationUtil.isEmpty(userNumId) && ValidationUtil.isEmpty(userPasswd)) {
            ErrMsg="参数错误"+userNumId+"-"+userPasswd;
            modelMap.put("success", false);
            //modelMap.put("errMsg", "输入参数有误");
            modelMap.put("errMsg", ErrMsg);
            return modelMap;
        }

        CwUserEntity cwUser = cwUserService.getCwUserByuId(userNumId);
        if (!cwUser.getUpWd().equals(userPasswd)) {
            modelMap.put("success", false);
            modelMap.put("errMsg", "密码有误");
            return modelMap;
        }
        modelMap.put("success", true);
        modelMap.put("errMsg", "交易成功");
        modelMap.put("UserInfo", cwUser);
        return modelMap;
    }

}
