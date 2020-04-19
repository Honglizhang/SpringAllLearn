package com.example.springmybatis.bean.mapper;

import com.example.springmybatis.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StudentMapper {

    @Insert("inster into Studemt(sno,sname,ssex) values(#{sno}，#{name},#{sex})")
    int addStu(Student student);

    @Update("update student set sname=#{name},ssex=#{sex} where sno=#{sno}")
    int updateStu(Student student);

    @Delete("delete from student where sno=#{sno}")
    int deleteStu(String sno);

    @Select("select * from student where sno=#{sno}")
    @Results(id = "student",value= {
            @Result(property = "sno", column = "sno", javaType = String.class),
            @Result(property = "name", column = "sname", javaType = String.class),
            @Result(property = "sex", column = "ssex", javaType = String.class)
    })
    Student queryById(String id);
//
//    @Select("select * from student")
//    @Results(id = "studentList",value= {
//            @Result(property = "sno", column = "sno", javaType = String.class),
//            @Result(property = "name", column = "sname", javaType = String.class),
//            @Result(property = "sex", column = "ssex", javaType = String.class)
//    })
//    List<Student> queryAll();
}
