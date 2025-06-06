package com.example.healthcare.controller;

import com.example.healthcare.model.Patient;
import com.example.healthcare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    @PostMapping("/vitals")
    public ResponseEntity<String> receiveVitals(@RequestBody Patient patient) {
        service.saveVitals(patient);
        return ResponseEntity.ok("Vitals received");
    }

    @GetMapping
    public List<Patient> getPatients() {
        return service.getAll();
    }
}
