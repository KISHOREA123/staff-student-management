package com.edumanage.studentstaff.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/test")
    public String test(){
        return "Backend is running and DB config is ready";
    }
}
