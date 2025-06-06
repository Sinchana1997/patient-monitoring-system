package com.example.healthcare.service;

import com.example.healthcare.model.Patient;
import com.example.healthcare.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repo;
    
    public void saveVitals(Patient patient) {
        repo.save(patient);
        if ((patient.getTemperature() != null && patient.getTemperature() > 102) ||
            (patient.getOxygenLevel() != null && patient.getOxygenLevel() < 90)) {
            System.out.println("Critical Alert!");
        }
    }

    public List<Patient> getAll() {
        return repo.findAll();
    }
}
