package com.lgsvc.wxserv.web;

import com.lgsvc.wxserv.dto.ChannelCustomExecution;
import com.lgsvc.wxserv.service.ChannelCustomInfoService;
import com.lgsvc.wxserv.util.HttpServletRequestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/channel")
public class channelMangerController {
    @Autowired
    ChannelCustomInfoService channelCustomInfoService;
    private final static Logger LOG = LoggerFactory.getLogger(channelMangerController.class);


    @RequestMapping(value = "/cur_customer_info", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> channelCustomInfo(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Integer customId = HttpServletRequestUtil.getInt(request, "custom_id");
        try {
            // 获取区域列表信息
            ChannelCustomExecution se = channelCustomInfoService.getChannelCustomList(customId);
            modelMap.put("channel_custom", se.getChannelCustomInfoList());
            modelMap.put("count", se.getCount());
            modelMap.put("success", true);
            modelMap.put("errMsg", se.getStateInfo());
            return modelMap;
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }
        return modelMap;
    }

}
