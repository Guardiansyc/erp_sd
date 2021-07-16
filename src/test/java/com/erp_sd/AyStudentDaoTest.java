package com.erp_sd;

import com.erp_sd.dao.StudentDao;
import com.erp_sd.domain.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class AyStudentDaoTest extends BaseJunit4Test{
    @Resource
    private StudentDao studentDao;

    @Test
    public void testFindAll(){
        List<Student> studentList = studentDao.selectStudents();
        System.out.println(studentList);
    }

    @Test
    public void testPageHelper(){
        PageHelper.startPage(3,1);
        List<Student> studentList = studentDao.selectStudents();
        PageInfo pageInfo = new PageInfo(studentList);
        System.out.println(pageInfo);
    }
}
