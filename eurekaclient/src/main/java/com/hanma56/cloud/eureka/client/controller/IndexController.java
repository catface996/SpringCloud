package com.hanma56.cloud.eureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/")
    public String hello(){
        return "hello";
    }

}
