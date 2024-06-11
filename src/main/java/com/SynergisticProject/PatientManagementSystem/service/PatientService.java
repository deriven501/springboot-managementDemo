package com.SynergisticProject.PatientManagementSystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SynergisticProject.PatientManagementSystem.model.Patient;
import com.SynergisticProject.PatientManagementSystem.repository.PatientRepository;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public void savePatient(Patient patient) {
        patientRepository.savePatient(patient);
    }

    public Patient getPatient(String id) {
        return patientRepository.findById(id).orElse(null);
    }

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    public void deletePatient(String id) {
        patientRepository.deleteById(id);
    }


}
