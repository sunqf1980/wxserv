package com.lgsvc.wxserv.web;

import com.lgsvc.wxserv.dto.ManageRecourcceExecution;
import com.lgsvc.wxserv.dto.ManageSysLogExecution;
import com.lgsvc.wxserv.dto.MangerAralmExcution;
import com.lgsvc.wxserv.dto.TbWangInfoExecution;
import com.lgsvc.wxserv.service.ManageInfoService;
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
@RequestMapping("/manage")
public class ManageController {
    @Autowired
    ManageInfoService manageInfoService;

    private final static Logger LOG = LoggerFactory.getLogger(ManageController.class);

    /**
     * 文件资源的-前端接口 resource_info
     */
    @RequestMapping(value = "/resource_info", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> manageResourceInfo(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();

        String sysName = HttpServletRequestUtil.getString(request, "sys_name");
        try {
            // 获取区域列表信息
            ManageRecourcceExecution se = manageInfoService.manageResourceinfoList(sysName);
            modelMap.put("hand_files", se.getTbResourceList());
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
     * 日志交易-前端接口 resource_info
     */
    @RequestMapping(value = "/sys_log", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> manageSysLogList(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();

        Integer customId = HttpServletRequestUtil.getInt(request, "customer_id");
        Integer pageIndex = HttpServletRequestUtil.getInt(request, "page_index");
        Integer pageSize = HttpServletRequestUtil.getInt(request, "page_size");

        try {
            // 获取区域列表信息
            ManageSysLogExecution se = manageInfoService.manageSysLogList(customId, pageIndex, pageSize);
            modelMap.put("sys_log", se.getCwSyslogList());
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
     * 报警警告信息-前端接口 warn_info
     */
    @RequestMapping(value = "/warn_info", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> manageWarnInfoTran(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Integer customId = HttpServletRequestUtil.getInt(request, "customer_id");
        try {
            // 获取区域列表信息
            TbWangInfoExecution se = manageInfoService.manageWarnInfoListCount(customId);
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
     * 报警警告信息-前端接口 warn_info_log
     */

    @RequestMapping(value = "/warn_info_log", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object>  frontWarnInfoTran(HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<String, Object>();

        Integer customId = HttpServletRequestUtil.getInt(request, "customer_id");
        Integer pageIndex = HttpServletRequestUtil.getInt(request, "page_index");
        Integer pageSize = HttpServletRequestUtil.getInt(request, "page_size");

        try {
            // 获取区域列表信息
            MangerAralmExcution se = manageInfoService.manageAralmList(customId,pageIndex,pageSize);
            modelMap.put("success", true);
            modelMap.put("errMsg", se.getStateInfo());
            modelMap.put("count", se.getCount());
            modelMap.put("warn_info_group", se.getAralmList());
            return modelMap;
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }
        return modelMap;
    }


}