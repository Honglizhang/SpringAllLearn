package com.example.springmybatis.service;

import com.example.springmybatis.bean.Student;

public interface StudentService {
    public  int add(Student student);

    public  int update(Student student);

    public  int deleteBysno(String sno);

    public  Student queryStudentBySno(String sno);
}
