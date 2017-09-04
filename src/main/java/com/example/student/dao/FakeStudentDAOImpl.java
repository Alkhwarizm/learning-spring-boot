package com.example.student.dao;

import com.example.student.entity.StudentDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FakeStudentDAOImpl implements StudentDAO {

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

    @Override
    public Collection<StudentDTO> getAllStudents() {
        return this.students.values();
    }

    @Override
    public StudentDTO getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void deleteStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(StudentDTO student) {
        StudentDTO updatedStudent = this.students.get(student.getId());
        updatedStudent.setCourse(student.getCourse());
        updatedStudent.setName(student.getName());
        this.students.put(student.getId(), student);
    }

    @Override
    public void insertStudent(StudentDTO student) {
        this.students.put(student.getId(), student);
    }
}
