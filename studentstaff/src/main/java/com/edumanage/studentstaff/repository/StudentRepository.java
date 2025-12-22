package com.edumanage.studentstaff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edumanage.studentstaff.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
