package com.SynergisticProject.PatientManagementSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document; 


@Document(collection = "patients")
public class Patient {
    @Id
    public String id;
    public String firstName;
    public String lastName;
    public int age;
    //private String birthDate;
    //private String diagnoses;
    //private String appointments;
    public Patient() {

    }
    
    public Patient(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}