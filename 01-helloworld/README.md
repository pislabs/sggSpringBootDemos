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