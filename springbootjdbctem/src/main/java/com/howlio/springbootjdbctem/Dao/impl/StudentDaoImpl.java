package com.howlio.springbootjdbctem.Dao.impl;

import com.howlio.springbootjdbctem.Dao.StudentDao;
import com.howlio.springbootjdbctem.bean.Student;
import com.howlio.springbootjdbctem.mapper.impl.studentMapper;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * @program: SpringAll
 * @description:
 * @author: howlio
 * @create: 2020-04-20 20:16
 **/

@Repository("StudentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addStu(Student student) {
        String sql = "insert into student(sno,sname,ssex) values(:sno,:name,:sex)";
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplate.getDataSource());
        BeanPropertySqlParameterSource beanPs = new BeanPropertySqlParameterSource(student);
        return namedParameterJdbcTemplate.update(sql, beanPs);
    }

    @Override
    public int updateStu(Student student) {
        String sql ="update student set sno=?,ssex=?,sname=?";
        Object args[]={student.getSno(),student.getSex(),student.getName()};
        int[] argsType={Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};
        return this.jdbcTemplate.update(sql,args,argsType);
    }

    @Override
    public int deleteStu(String sno) {
        String sql="delete student where sno=?";
        Object[] args={sno};
        int[] argsType={Types.VARCHAR};
        return this.jdbcTemplate.update(sql,args,argsType);
    }

    @Override
    public Student queryByNo(String sno) {
        String sql="select * from student where sno=?";
        Object[] args={sno};
        int[] argsType={Types.VARCHAR};
        List<Student> studentList = this.jdbcTemplate.query(sql,args,argsType,new studentMapper());
        if(studentList != null || studentList.size()>0){
            return studentList.get(0);
        }else{
            return null;
        }

    }

    @Override
    public List<Map<String, Object>> queryAll() {
        String sql="select * from student";
        return this.jdbcTemplate.queryForList(sql);
    }
}
