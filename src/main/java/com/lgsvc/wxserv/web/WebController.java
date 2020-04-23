package com.lgsvc.wxserv.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class WebController {

    @RequestMapping(value = "/",  method = RequestMethod.GET)
    @ResponseBody

    public String webTest(){
        return "你好！世界！ ";
    }
}
