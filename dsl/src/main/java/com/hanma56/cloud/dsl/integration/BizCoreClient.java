package com.hanma56.cloud.dsl.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 张钟
 * @date 2018/2/2
 */
@FeignClient(value = "bizcore")
public interface BizCoreClient {

    /**
     * 调用bizcore的hello接口
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
