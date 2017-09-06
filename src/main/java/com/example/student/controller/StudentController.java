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

    @GetMapping
    public Collection<StudentDTO> getAllStudents()  {
        return this.studentServices.getAllStudents();
    }

    @GetMapping(value = "/{id}")
    public StudentDTO getStudentById(@PathVariable("id") int id) {
        return this.studentServices.getStudentById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudentById(@PathVariable("id") int id) {
        this.studentServices.deleteStudentById(id);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody StudentDTO student) {
        this.studentServices.updateStudent(student);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody StudentDTO student) {
        this.studentServices.insertStudent(student);
    }
}
