package com.example.student.controller;

import com.example.student.entity.StudentDTO;
import com.example.student.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<StudentDTO> getAllStudents() {
        return this.studentServices.getAllStudents();
    }
}
