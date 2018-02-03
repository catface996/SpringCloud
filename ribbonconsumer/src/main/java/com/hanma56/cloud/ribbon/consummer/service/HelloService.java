package com.hanma56.cloud.ribbon.consummer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 张钟
 * @date 2018/2/3
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 调用 master data 的 hello 服务
     * @return
     */
    public String hiService() {
        return restTemplate.getForObject("http://master-data/hello",String.class);
    }
}
