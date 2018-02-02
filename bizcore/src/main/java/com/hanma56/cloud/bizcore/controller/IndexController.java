package com.hanma56.cloud.bizcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanma56.cloud.bizcore.integration.MasterDataClient;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@RestController
public class IndexController {

    @Autowired
    private MasterDataClient masterDataClient;

    @RequestMapping(value = "/hello")
    public String hello() {
        String message = masterDataClient.hello();
        return message + "\n" + "This is bizCore!";
    }
}
