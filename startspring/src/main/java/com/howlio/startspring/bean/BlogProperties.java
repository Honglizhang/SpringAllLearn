package com.howlio.startspring.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: startspring
 * @description:
 * @author: howlio
 * @create: 2020-04-16 20:04
 **/
@Component
@Data
public class BlogProperties {

    //配置文件中获取属性值
    @Value("${name}")
    private String name;
    @Value("${title}")
    private  String title;
    @Value("wholeTitle")
    private String wholeTitle;

}
