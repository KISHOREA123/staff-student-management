package com.edumanage.studentstaff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.GetMapping;

import com.edumanage.studentstaff.service.StaffService;
import com.edumanage.studentstaff.service.StudentService;

import jakarta.servlet.http.HttpSession;

@Controller
public class DashboardController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StaffService staffService;

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session) {

    if (session.getAttribute("admin") == null) {
        return "redirect:/login";
    }

    return "dashboard";
}

}
