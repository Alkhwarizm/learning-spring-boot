package com.example.student.dao;

import com.example.student.entity.StudentDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoStudentDAOImpl implements StudentDAO {

    @Override
    public Collection<StudentDTO> getAllStudents() {
        return new ArrayList<StudentDTO>() {
            {
                add(new StudentDTO(1, "Mario", "Nothing"));
            }
        };
    }

    @Override
    public StudentDTO getStudentById(int id) {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }

    @Override
    public void updateStudent(StudentDTO student) {

    }

    @Override
    public void insertStudent(StudentDTO student) {

    }
}
