package com.howlio.springbootjdbctem.mapper.impl;

import com.howlio.springbootjdbctem.bean.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @program: SpringAll
 * @description:
 * @author: howlio
 * @create: 2020-04-20 20:46
 **/


public class studentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student= new Student();
        student.setSno(rs.getString("sno"));
        student.setSex(rs.getString("ssex"));
        student.setName(rs.getString("sname"));
        return student;
    }
}
