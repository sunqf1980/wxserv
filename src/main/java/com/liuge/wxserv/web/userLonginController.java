package com.liuge.wxserv.web;

import com.liuge.wxserv.entity.CwUser;
import com.liuge.wxserv.service.CwUserService;
import com.liuge.wxserv.util.HttpServletRequestUtil;
import com.liuge.wxserv.util.ValidationUtil;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class userLonginController {
    @Autowired
    private CwUserService cwUserService;

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
        log.warn("hille word");
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
