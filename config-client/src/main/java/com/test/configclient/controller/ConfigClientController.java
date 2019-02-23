package com.test.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 需要给加载变量的类上面加载@RefreshScope，在客户端执行/refresh的时候就会更新此类下面的变量值
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private String age;

    @GetMapping("/profile")
    public String hello() {
        return this.profile + "," + name + "," + age;
    }
}
