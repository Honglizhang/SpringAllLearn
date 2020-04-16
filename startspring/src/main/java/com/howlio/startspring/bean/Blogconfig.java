package com.howlio.startspring.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @program: startspring
 * @description: 自定义配置文件引用
 * @author: howlio
 * @create: 2020-04-16 20:20
 **/

@Configuration
@ConfigurationProperties(prefix = "blogconfig")
@PropertySource("classpath:blogconfig.properties")
@Component
@Data
public class Blogconfig {

    private String name;
    private int age;

}
