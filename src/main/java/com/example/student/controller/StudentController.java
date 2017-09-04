package com.example.student.controller;

import com.example.student.entity.StudentDTO;
import com.example.student.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<StudentDTO> getAllStudents()  {
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

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody StudentDTO student) {
        this.studentServices.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody StudentDTO student) {
        this.studentServices.insertStudent(student);
    }
}
