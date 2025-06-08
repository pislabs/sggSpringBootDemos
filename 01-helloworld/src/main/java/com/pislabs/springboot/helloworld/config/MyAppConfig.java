package com.pislabs.springboot.helloworld.config;

import com.pislabs.springboot.helloworld.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rayl
 * @description:
 * @date 2025/6/9 06:51
 */
@Configuration  // 指明当前类为一个配置类；就是来替代之前的Spring配置文件
public class MyAppConfig {
    /**
     * 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService2() {
        System.out.println("配置类@Bean给容器中添加组件了...");

        return new HelloService();
    }
}
