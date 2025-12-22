package com.edumanage.studentstaff.service;

import java.util.List;
import com.edumanage.studentstaff.entity.Staff;

public interface StaffService {

    Staff saveStaff(Staff staff);

    List<Staff> getAllStaff();

    Staff getStaffById(Long id);

    void deleteStaff(Long id);

    long getStaffCount();
}
