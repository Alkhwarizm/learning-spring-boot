package com.example.student.service;

import com.example.student.dao.StudentDAO;
import com.example.student.entity.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServices {

    @Autowired
    private StudentDAO studentDAO;

    public Collection<StudentDTO> getAllStudents() {
        return this.studentDAO.getAllStudents();
    }

    public StudentDTO getStudentById(int id) {
        return this.studentDAO.getStudentById(id);
    }

    public void deleteStudentById(int id) {
        this.studentDAO.deleteStudentById(id);
    }

    public void updateStudent(StudentDTO student) {
        this.studentDAO.updateStudent(student);
    }
}
