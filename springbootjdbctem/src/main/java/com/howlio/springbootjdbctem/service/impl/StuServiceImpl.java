package com.howlio.springbootjdbctem.service.impl;

import com.howlio.springbootjdbctem.Dao.StudentDao;
import com.howlio.springbootjdbctem.bean.Student;
import com.howlio.springbootjdbctem.service.IstudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: SpringAll
 * @description:
 * @author: howlio
 * @create: 2020-04-20 20:56
 **/

@Service("stuService")
public class StuServiceImpl implements IstudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int add(Student student) {
        return studentDao.addStu(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.updateStu(student);
    }

    @Override
    public int deleteBysno(String sno) {
        return studentDao.deleteStu(sno);
    }

    @Override
    public List<Map<String, Object>> queryStudentListMap() {
        return studentDao.queryAll();
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return studentDao.queryByNo(sno);
    }
}
