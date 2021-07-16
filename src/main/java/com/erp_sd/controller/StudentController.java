package com.erp_sd.controller;

import com.erp_sd.domain.Student;
import com.erp_sd.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentService service;

    @RequestMapping(value = "/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败";
        int nums = service.addStudent(student);
        if( nums > 0){
            tips = "学生【" + student.getName() + "】注册成功";
        }
        mv.addObject("tips",tips);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping(value = "/queryStudents.do")
    @ResponseBody
    public List<Student> queryStudents(Student student){
        List<Student> studentList = service.findStudents();
        return studentList;
    }
}
