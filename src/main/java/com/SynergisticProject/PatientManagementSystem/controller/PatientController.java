package com.SynergisticProject.PatientManagementSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Patient-Management")
public class PatientController {
    
    @GetMapping("/intro")
    public String testIntro() {
        return "Introduction to Patient Management System";
    }
}
