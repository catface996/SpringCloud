package com.hanma56.cloud.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张钟
 * @date 2018/2/7
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/")
    public String index(){
        return "hello docker";
    }
}
