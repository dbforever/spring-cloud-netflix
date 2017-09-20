
# Spring Cloud Netflix 分布式微服务实践

> 使用Eureka做服务注册发现，Feign做服务调用，Zuul做微服务网关，Ribbon负载均衡，Hystrix服务容错保护/断路器

### eureka-server 服务注册中心

运行服务，打开http://localhost:8761/

看到注册有三个服务，其中userinfo-microservice有两个实例

![服务注册中心](pic/1.png)

### server-provider 服务提供者

运行两个实例，在2017和2018端口提供了一个查询用户信息的API

访问http://localhost:2017/userinfo 或 http://localhost:2018/userinfo

![返回结果](pic/2.png)

### feign-consumer 服务消费者

消费服务userinfo-microservice

访问 http://localhost:3000/user 

返回结果

![返回结果](pic/3.png)

### zuul-gateway 微服务网关

用serviceId代替URL，实现动态路由

网关路由到userinfo-consumer的接口，返回结果被Zuul过滤器替换

访问 http://localhost:4000/getuser/user

![返回结果](pic/4.png)

### hystrix-turbine 服务监控

打开 http://localhost:5000/hystrix

![Hystrix Turbine](pic/5.png)

填入 http://localhost:5000//turbine.stream 查看服务运行状态

![Hystrix Turbine](pic/6.png)