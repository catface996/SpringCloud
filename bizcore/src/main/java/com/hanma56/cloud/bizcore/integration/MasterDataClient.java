package com.hanma56.cloud.bizcore.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@FeignClient(value = "masterdata")
public interface MasterDataClient {

    /**
     * 调用master data 的 hello 服务
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
