package com.config.client.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloConfigClient(){
        return "Hello Spring Cloud Config Client!!!";
    }

    /**
     * 通过 @Value 来将配置文件中的值写入到代码中,
     * clientApplication客户端启动时候获取分支上的配置参数${from}时候,配置中心会从git仓库拉取config-dev.properties,config.properties等文件到本地
     */
    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String from() {
        return from;
    }

}
