# SpringCloud
spring cloud学习

#eureka 常见问题解决

http://www.itmuch.com/spring-cloud-sum-eureka/

#eureka server 和 eureka client 的集成
参考 eurekaserver 模块 和 eurekaclient 模块

#feign调用链

dsl为服务门面,bizcore为核心服务层,masterdata为基础服务层
调用过程 dsl call bizcore  call masterdata

#ribbon调用关系

ribbonconsummer 调用 masterdata,为了体现负载均衡的效果,建议通过执行jar包的方式,可以指定不同的masterdata端口来区别服务

#zuul 调用关系
zuul直接调用masterdata,为了体现负责均衡,可以启动两个master服务,指定不同的端口

#docker 镜像  
https://cloud.docker.com/swarm/zlyxzq/repository/list
# 1. 登录docker账号 命令行登录  docker login 如果docker cloud中未创建镜像,需创建,例如创建镜像:catface
# 2. tag 镜像
# 3. push 镜像
docker tag docker-demo:1.0.0-SNAPSHOT zlyxzq/catface:latest
docker push zlyxzq/catface:latest