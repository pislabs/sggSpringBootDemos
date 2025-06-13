package com.pislabs.springboot.webrestfulecrud.config;

import com.pislabs.springboot.webrestfulecrud.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author rayl
 * @description: 使用WebMvcConfigurerAdapter可以来扩展SpringMVC功能
 * @date 2025/6/15 06:58
 */
// @EnableWebMvc // 全面接管SpringMVC功能（一般不推荐）
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器发送/labs请求来到success页面
        registry.addViewController("/labs").setViewName("success");
    }

    // 所有的WebMavConfigAdapter都会一起起作用
    @Bean   // 将组件注册到容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
            }

            // 注册拦截器
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
//                super.addInterceptors(registry);
                // 静态资源：*.css, *.js
                // SpringBoot已经做好了静态资源映射，无需添加
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                        .excludePathPatterns("/index.html", "/", "/user/login");
            }
        };
        return adapter;
    }
}
