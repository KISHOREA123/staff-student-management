package com.edumanage.studentstaff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edumanage.studentstaff.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
