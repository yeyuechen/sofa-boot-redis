# sofa-boot-redis

## 关于
sofa-boot-redis是spring-boot的web示例，基于maven的工程。

## 二、功能简介

为了解决 Spring Boot 在实施大规模微服务架构时候的问题，SOFABoot 提供了以下的能力：

### 2.1 增强 Spring Boot 的健康检查能力

针对 Spring Boot 缺少 Readiness Check 能力的情况，SOFABoot 增加了 Spring Boot 现有的健康检查的能力，提供了 Readiness Check 的能力。利用 Readiness Check 的能力，SOFA 中间件中的各个组件只有在 Readiness Check 通过之后，才将流量引入到应用的实例中，比如 RPC，只有在 Readiness Check 通过之后，才会向服务注册中心注册，后面来自上游应用的流量才会进入。

除了中间件可以利用 Readiness Check 的事件来控制流量的进入之外，PAAS 系统也可以通过访问 `http://localhost:8081/health/readiness` 来获取应用的 Readiness Check 的状况，用来控制例如负载均衡设备等等流量的进入。

### 2.2 提供类隔离的能力

为了解决 Spring Boot 下的类依赖冲突的问题，SOFABoot 基于 SOFAArk 提供了 Spring Boot 上的类隔离的能力，在一个 SOFABoot 的系统中，只要引入 SOFAArk 相关的依赖，就可以将 SOFA 中间件相关的类和应用相关的类的 ClassLoader 进行隔离，防止出现类冲突。当然，用户也可以基于 SOFAArk，将其他的中间件、第三方的依赖和应用的类进行隔离。

### 2.3 日志空间隔离能力

为了统一大规模微服务场景下的中间件日志的打印，SOFABoot 提供了日志空间隔离的能力给 SOFA 中间件，SOFA 中间件中的各个组件采用日志空间隔离的能力之后，自动就会将本身的日志和应用的普通日志隔离开来，并且打印的日志的路径也是相对固定，非常方便进行统一地监控。

### 2.4 SOFA 中间件的集成管理

基于 Spring Boot 的自动配置能力，SOFABoot 提供了 SOFA 中间件统一易用的编程接口以及 Spring Boot 的 Starter，方便在 Spring Boot 环境下使用 SOFA 中间件，SOFA 中间件中的各个组件都是独立可插拔的，节约开发时间，和后期维护的成本。

### 2.5 模块化开发

SOFABoot 从 2.4.0 版本开始支持基于 Spring 上下文隔离的模块化开发能力，每个 SOFABoot 模块使用独立的 Spring 上下文，避免不同 SOFABoot 模块间的 BeanId 冲突，有效降低企业级多模块开发时团队间的沟通成本。

## 编译运行
tomcat7以上，jdk1.7及以上

### 运行
在工程目录下执行: Application.class

浏览器输入：http://localhost:8081/

测试实例：com.dtcj.zz.springboot.ApplicationTests

### 结果
HELLO WORLD ....
