## 打包执行
maven -> lifecycle -> package
```bash
# 启动
java -jar app.jar
```

## 导入依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

### spring-boot-starter-web:
spring-boot-starter:spring-boot场景启动起；帮我们导入了web模块正常运行所依赖的组件；

SpringBoot将所有的功能场景都抽取出来，做成一个个starters（启动器），只需要在项目里面引入这些starter相关场景的所有依赖都会导入进来。
想要用什么功能就导入什么场景的启动器。


## 指定环境
```bash
# 命令行参数
java -jar 01-helloword-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
```

## 虚拟机参数
-Dspring.profiles.active=dev

## 配置优先级

### 配置文件优先级

由高到低，高优先级配置会覆盖低优先级（覆盖）

- file:./config/
- file:./
- classpath:./config/
- classpath:./

我们还可以通过spring.config.location来改变默认的配置文件为位置。

项目打包好后，我们可以用命令行参数的形式，启动项目的时候来指定配置文件的新位置；
指定配置文件和默认加载的这些配置文件共同起作用形成互补配置


### 配置优先级

Spring也可以从一下位置加载配置，优先级如下：
- 命令行参数
- 来自java:comp/env的JNDI属性
- Java系统属性（System.getProperties）
- 操作系统环境变量
- RandomValuePropertySource配置的random.*属性值
- jar包外部的application-{profile}.properties或application.yml(带spring.profile)配置文件
- jar包内部的application-{profile}.properties或application.yml(带spring.profile)配置文件
- jar包外部的application.properties或application.yml(不带spring.profile)配置文件
- jar包内部的application.properties或application.yml(不带spring.profile)
- @Configuration注解类上的@PropertySource
- 通过SpringApplication.setDefaultProperties指定的默认属性

所有支持的配置加载来源参考官方文档：
https://docs.spring.io/spring-boot/docs/2.0.3.RELEASE/reference/htmlsingle/#boot-features-external-config