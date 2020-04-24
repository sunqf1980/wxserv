package com.lgsvc.wxserv.web;

import com.lgsvc.wxserv.service.CwUserService;
import com.lgsvc.wxserv.util.ValidationUtil;
import com.lgsvc.wxserv.entity.CwUser;
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
@RequestMapping("/wxapp")
public class userLonginController {
    @Autowired
    private CwUserService cwUserService;
    private final static Logger LOG = LoggerFactory.getLogger(userLonginController.class);

    @RequestMapping(value = "/user_login", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> userLoginCheck(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        /* 获取输入的 登陆id*/
        String userNumId = HttpServletRequestUtil.getString(request, "userNum");
        String userPasswd = HttpServletRequestUtil.getString(request, "UserPassword");
        if (ValidationUtil.isEmpty(userNumId) || ValidationUtil.isEmpty(userPasswd)) {
            modelMap.put("success", false);
            modelMap.put("errMsg", "输入参数有误");
            return modelMap;
        }

        CwUser cwUser = cwUserService.getCwUserByuId(userNumId);
        if (!cwUser.getUpWd().equals(userPasswd)) {
            modelMap.put("success", false);
            modelMap.put("errMsg", "密码失败");
            return modelMap;
        }
        modelMap.put("success", true);
        modelMap.put("errMsg", "交易成功");
        modelMap.put("UserInfo", cwUser);
        return modelMap;
    }

}
