package com.example.hcmcwebfinalexampracticequestion.repository;

import com.example.hcmcwebfinalexampracticequestion.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
