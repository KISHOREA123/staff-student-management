package com.edumanage.studentstaff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edumanage.studentstaff.service.StudentService;
import com.edumanage.studentstaff.service.StaffService;

@Controller
public class DashboardController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StaffService staffService;

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {

        model.addAttribute("studentCount", studentService.getStudentCount());
        model.addAttribute("staffCount", staffService.getStaffCount());

        return "dashboard";
    }
}
