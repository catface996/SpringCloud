package com.hanma56.cloud.ribbon.consummer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public String hiService() {
        return restTemplate.getForObject("http://masterdata/hello",String.class);
    }

    /**
     * 当 springms-provider-user 服务宕机或者不可用时，即请求超时后会调用此方法。
     *
     * @return
     */
    public String findByIdFallback() {
        return "断路";
    }
}
