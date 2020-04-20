package com.howlio.springbootjdbctem.Dao;


import com.howlio.springbootjdbctem.bean.Student;

import java.util.List;
import java.util.Map;

public interface StudentDao {

    public int addStu(Student student);

    public int updateStu(Student student);

    public  int deleteStu(String sno);

    public Student queryByNo(String sno);

    public List<Map<String,Object>> queryAll();
}
