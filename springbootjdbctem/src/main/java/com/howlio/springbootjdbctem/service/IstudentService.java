package com.howlio.springbootjdbctem.service;

import com.howlio.springbootjdbctem.bean.Student;

import java.util.List;
import java.util.Map;

public interface IstudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    List<Map<String, Object>> queryStudentListMap();
    Student queryStudentBySno(String sno);
}
