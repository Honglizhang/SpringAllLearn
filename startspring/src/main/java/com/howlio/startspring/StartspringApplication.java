package com.howlio.startspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.boot.Banner.*;

/**
 * 
 */
@RestController
@SpringBootApplication
public class StartspringApplication {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World";
    }
    public static void main(String[] args) {


        SpringApplication application =new SpringApplication(StartspringApplication.class);
//        关闭banner配置
        application.setBannerMode(Mode.OFF);
//        设置配置不可修改
        application.setAddCommandLineProperties(false);
        application.run(args);
    }

}
