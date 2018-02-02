//package com.hanma56.cloud.dsl.integration;
//
//import feign.hystrix.FallbackFactory;
//import org.springframework.stereotype.Component;
//
///**
// * @author 张钟
// * @date 2018/2/2
// */
//@Component
//public class BizCoreClientCallBack implements FallbackFactory<BizCoreClient> {
//    @Override
//    public BizCoreClient create(Throwable cause) {
//        return new BizCoreClient() {
//            @Override
//            public String hello() {
//                return "fail";
//            }
//        };
//    }
//}
