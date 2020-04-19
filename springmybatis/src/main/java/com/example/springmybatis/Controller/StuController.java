package com.example.springmybatis.Controller;

import com.example.springmybatis.bean.Student;
import com.example.springmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springmybatis
 * @description: 控制层
 * @author: howlio
 * @create: 2020-04-20 01:28
 **/

@RestController
public class StuController {

    @Autowired
    private  StudentService studentService;

    @RequestMapping(value = "/queryStu",method = RequestMethod.GET)
    public Student queryStu(String sno){
        Student student=this.studentService.queryStudentBySno(sno);
        return student;
    }
    
    
}
