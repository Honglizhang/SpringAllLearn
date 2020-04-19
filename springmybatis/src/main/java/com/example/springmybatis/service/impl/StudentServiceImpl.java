package com.example.springmybatis.service.impl;

import com.example.springmybatis.bean.Student;
import com.example.springmybatis.bean.mapper.StudentMapper;
import com.example.springmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springmybatis
 * @description:
 * @author: howlio
 * @create: 2020-04-20 01:18
 **/

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return studentMapper.addStu(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.updateStu(student);
    }

    @Override
    public int deleteBysno(String sno) {
        return studentMapper.deleteStu(sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return studentMapper.queryById(sno);
    }
}
