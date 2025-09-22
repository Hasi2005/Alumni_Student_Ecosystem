package com.example.auth_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class DashboardController {

    @GetMapping("/student")
    public String student() {
        return "forward:/dash/student.html";
    }

    @GetMapping("/alumni")
    public String alumni() {
        return "forward:/dash/alumni.html";
    }

    @GetMapping("/admin")
    public String admin() {
        return "forward:/dash/admin.html";
    }
}

