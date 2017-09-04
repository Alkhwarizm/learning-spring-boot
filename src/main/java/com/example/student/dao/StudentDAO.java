package com.example.student.dao;

import com.example.student.entity.StudentDTO;

import java.util.Collection;

public interface StudentDAO {
    Collection<StudentDTO> getAllStudents();

    StudentDTO getStudentById(int id);

    void deleteStudentById(int id);

    void updateStudent(StudentDTO student);

    void insertStudent(StudentDTO student);
}
