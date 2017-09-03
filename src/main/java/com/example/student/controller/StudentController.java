package com.example.student.controller;

import com.example.student.entity.StudentDTO;
import com.example.student.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public StudentDTO getStudentById(@PathVariable("id") int id) {
        return this.studentServices.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id) {
        this.studentServices.deleteStudentById(id);
    }
}
