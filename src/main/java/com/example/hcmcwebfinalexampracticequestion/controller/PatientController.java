package com.example.hcmcwebfinalexampracticequestion.controller;

import com.example.hcmcwebfinalexampracticequestion.model.Patient;
import com.example.hcmcwebfinalexampracticequestion.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping(value = {"/patients"})
    public ModelAndView displayListOfPatients() {
        ModelAndView modelAndView = new ModelAndView();
        List<Patient> listOfPatients = patientService.listOfPatients();
        System.out.println("HERE");
       // System.out.println(listOfPatients.get(0));
        modelAndView.addObject("patientsList", listOfPatients);
        modelAndView.setViewName("patientPage/Patients");
        return modelAndView;
    }



//    @GetMapping(value = "/list")
//    public String displayAllPatients(Model model) {
//        model.addAttribute("patients", patientService.listOfPatients());
//        return "patient/list";
//    }


}
