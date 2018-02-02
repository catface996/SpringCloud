package com.hanma56.cloud.dsl.controller;

import com.hanma56.cloud.dsl.integration.BizCoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@RestController
public class IndexController {

    @Autowired
    private BizCoreClient bizCoreClient;

    @RequestMapping(value = "/hello")
    public String hello(){
        String message = bizCoreClient.hello();
        return message+"\n"+"This is dsl!";
    }
}
