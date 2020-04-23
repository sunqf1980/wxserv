package com.lgsvc.wxserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.lgsvc.wxserv"})
public class WxservApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxservApplication.class, args);
    }

}
