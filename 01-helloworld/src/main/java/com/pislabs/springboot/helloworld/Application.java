package com.pislabs.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

/**
 * @author rayl
 * @description:
 * @date 2025/6/7 01:47
 */
@ImportResource(locations = "classpath:beans.xml")  // 导入Spring配置文件，让其生效
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
