package com.erp_sd.dao;

import com.erp_sd.domain.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);
    List<Student> selectStudents();
}
