package com.example.hcmcwebfinalexampracticequestion.service;

import com.example.hcmcwebfinalexampracticequestion.model.Patient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PatientService {

    public List<Patient> listOfPatients();

    Patient addNewPatient(Patient patient);
}
