package com.howlio.startspring.colntroller;

import com.howlio.startspring.bean.BlogProperties;
import com.howlio.startspring.bean.Blogconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: startspring
 * @description:
 * @author: howlio
 * @create: 2020-04-16 20:11
 **/

@RestController
public class BlogController {

    @Autowired
    BlogProperties blogProperties;

    @Autowired
    Blogconfig blogconfig;

    @RequestMapping("/index")
    String index(){
        return  blogProperties.getName()+"-----"+blogProperties.getTitle()+blogconfig.getName()+"__"+blogconfig.getAge();
    }

}
