package com.hanma56.cloud.masterdata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "This is master data!";
    }
}
