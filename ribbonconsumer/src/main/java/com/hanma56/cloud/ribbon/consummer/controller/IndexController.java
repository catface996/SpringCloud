package com.hanma56.cloud.ribbon.consummer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanma56.cloud.ribbon.consummer.service.HelloService;

/**
 * @author 张钟
 * @date 2018/2/3
 */
@RestController
public class IndexController {

    @Autowired
    private HelloService helloService;


    @RequestMapping(value = "/hello")
    public String hello(){
        String result = helloService.hiService();
        return result + "\n" + "This is ribbon consumer!";
    }

}
