package com.hanma56.cloud.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.hanma56.cloud.springcloud.dao"})
public class SpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}
}
