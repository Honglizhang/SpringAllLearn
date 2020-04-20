package com.howlio.springbootjdbctem.controller;

import com.howlio.springbootjdbctem.bean.Student;
import com.howlio.springbootjdbctem.service.IstudentService;
import com.sun.org.apache.xpath.internal.objects.XObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.resources.MsgAppletViewer;

import javax.xml.ws.RequestWrapper;
import java.util.List;
import java.util.Map;

/**
 * @program: SpringAll
 * @description: 控制层
 * @author: howlio
 * @create: 2020-04-20 21:26
 **/

@RestController
public class StudentController {

    @Autowired
    private IstudentService studentService;

    private Student student;

    @RequestMapping(value = "/queryStu",method = RequestMethod.GET)
    public Student queryStu(String sno){
        student=studentService.queryStudentBySno(sno);
        return  student;
    }

    @RequestMapping(value ="/queryAll",method = RequestMethod.GET)
    public List<Map<String,Object>> queryAllStudent(){
        List<Map<String, Object>> studentList= this.studentService.queryStudentListMap();
         return studentList;
    }

    @RequestMapping(value = "/addStu",method = RequestMethod.GET)
    public int addStu(String sno,String ssex,String sname){
        student= new Student();
        student.setSno(sno);
        student.setSex(ssex);
        student.setName(sname);
        return studentService.add(student);
    }

    @RequestMapping(value = "deleteStu",method = RequestMethod.DELETE)
    public int deleteStu(String sno){
        return  this.studentService.deleteBysno(sno);
    }
}
