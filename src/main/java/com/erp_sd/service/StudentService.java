package com.erp_sd.service;

import com.erp_sd.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    List<Student> findStudents();
}
