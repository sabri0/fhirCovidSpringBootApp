package com.prf.covid.patient;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class PatientService {
    public List<Patient> getPatients(){
        return List.of(
                new Patient(
                        1L,
                        true,
                        "Sabri",
                        23456789,
                        LocalDate.of(1999, Month.JANUARY,5),
                        "male",
                        List.of()),
                new Patient(
                        2L,
                        true,
                        "Maroune",
                        23456789,
                        LocalDate.of(2000, Month.JANUARY,5),
                        "male",
                        List.of())
        );
    }
}
