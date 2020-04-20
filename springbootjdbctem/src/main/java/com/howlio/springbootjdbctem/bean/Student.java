package com.howlio.springbootjdbctem.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: springmybatis
 * @description: 实体类
 * @author: howlio
 * @create: 2020-04-20 00:21
 **/

@Data
public class Student implements Serializable {
    private  static  final long serVersionUID=-339516038496531943L;
    private String sno;
    private String name;
    private String sex;
}
