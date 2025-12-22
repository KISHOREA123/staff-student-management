package com.edumanage.studentstaff.service;

import java.util.List;
import com.edumanage.studentstaff.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    void deleteStudent(Long id);

    long getStudentCount();
}
