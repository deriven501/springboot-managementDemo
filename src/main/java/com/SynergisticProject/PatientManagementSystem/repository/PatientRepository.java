package com.SynergisticProject.PatientManagementSystem.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.SynergisticProject.PatientManagementSystem.model.Patient;

public interface PatientRepository extends MongoRepository<Patient,String>{ 
    public void savePatient(Patient patient);
    public Patient getPatient(String id);
    public List<Patient> getAllPatients();
    public List<Patient> findByLastName(String lastName);
    public List<Patient> findByAge(int age);
    public void deletePatient(String id);
}
