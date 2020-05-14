package com.lgsvc.wxserv.web;

import com.lgsvc.wxserv.dto.ChannelCustomExecution;
import com.lgsvc.wxserv.dto.ChannelHisExecution;
import com.lgsvc.wxserv.dto.ChxCurExecution;
import com.lgsvc.wxserv.enums.ChannelCustomStateEnum;
import com.lgsvc.wxserv.service.ChannelCustomInfoService;
import com.lgsvc.wxserv.service.ChannelHisService;
import com.lgsvc.wxserv.service.ChxCurService;
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

    @Autowired
    ChxCurService chxCurService;

    @Autowired
    ChannelHisService channelHisService;

    private final static Logger LOG = LoggerFactory.getLogger(channelMangerController.class);


    @RequestMapping(value = "/cur_customer_info", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> channelCustomInfo(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Integer customId = HttpServletRequestUtil.getInt(request, "customer_id");
        System.out.print("&&&&&&&&----"+ customId);
        try {
            // 获取区域列表信息
            ChannelCustomExecution se = channelCustomInfoService.getChannelCustomList(customId);
            if(se.getState() != ChannelCustomStateEnum.SUCCESS.getState()) {
                modelMap.put("success", false);
                modelMap.put("errMsg", se.getStateInfo());
                return modelMap;
            }
            modelMap.put("channel_custom", se.getChannelCustomInfoList());
            modelMap.put("count", se.getCount());
            modelMap.put("success", true);
            modelMap.put("errMsg", se.getStateInfo());
            return modelMap;
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
            return modelMap;
        }
    }

    /**
     * 前端交易---chx_curr_channel 实现
     *
     * @param customerid channel_id
     * @return
     */
    @RequestMapping(value = "/chx_curr_channel", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> channelChxCustomInfo(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Integer customId = HttpServletRequestUtil.getInt(request, "customer_id");
        String channelId = HttpServletRequestUtil.getString(request, "channel_id");
        Integer pageIndex = HttpServletRequestUtil.getInt(request, "page_index");
        Integer pageSize = HttpServletRequestUtil.getInt(request, "page_size");
        LOG.info("获取的参数:" + customId + "channelId: " + channelId + "pags_index:" + pageIndex + "page_size:" + pageSize);

        try {
            // 获取区域列表信息
            ChxCurExecution se = chxCurService.ChxCurList(customId, channelId, pageIndex, pageSize);
            modelMap.put("cur_chx_channel", se.getChxCurList());
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


    /**
     * 前端交易---his_channel 实现
     *
     * @param customerid channel_id
     *                   channel_id
     * @return
     */
    @RequestMapping(value = "/his_channel", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> channelHisInfo(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Integer customId = HttpServletRequestUtil.getInt(request, "customer_id");
        String channelId = HttpServletRequestUtil.getString(request, "channel_id");
        Integer pageIndex = HttpServletRequestUtil.getInt(request, "page_index");
        Integer pageSize = HttpServletRequestUtil.getInt(request, "page_size");

        try {
            // 获取区域列表信息
            ChannelHisExecution se = channelHisService.getChannelHisList(customId, channelId, pageIndex, pageSize);
            modelMap.put("his_chx_channel", se.getChxHisList());
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
