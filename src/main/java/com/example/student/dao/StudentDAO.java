package com.example.student.dao;

import com.example.student.entity.StudentDTO;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDAO {

    private static Map<Integer, StudentDTO> students;

    static {
        students = new HashMap<Integer, StudentDTO>() {
            {
                put(1, new StudentDTO(1, "Andi", "Maths"));
                put(2, new StudentDTO(2, "Bob", "Physics"));
                put(3, new StudentDTO(3, "Chloe", "Chemistry"));
            }
        };
    }

    public Collection<StudentDTO> getAllStudents() {
        return this.students.values();
    }
}
