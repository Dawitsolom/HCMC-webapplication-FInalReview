package com.example.hcmcwebfinalexampracticequestion.controller;

import com.example.hcmcwebfinalexampracticequestion.model.Patient;
import com.example.hcmcwebfinalexampracticequestion.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hcmcweb/api/patient")
public class PatientRestController {
    @Autowired
    private PatientService patientService;

    @GetMapping(value = "/list")
    public List<Patient> displayAllPatients() {
        return patientService.listOfPatients();
    }
}
