package com.example.hcmcwebfinalexampracticequestion.service.impl;

import com.example.hcmcwebfinalexampracticequestion.model.Patient;
import com.example.hcmcwebfinalexampracticequestion.repository.PatientRepository;
import com.example.hcmcwebfinalexampracticequestion.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

//    public PatientServiceImpl(PatientRepository patientRepository) {
//        this.patientRepository=patientRepository;
//    }

    @Override
    public List<Patient> listOfPatients() {
        return patientRepository.findAll(Sort.by(Sort.Direction.DESC,"fullName"));
    }



    @Override
    public Patient addNewPatient(Patient patient) {
         return patientRepository.save(patient);
    }
}
