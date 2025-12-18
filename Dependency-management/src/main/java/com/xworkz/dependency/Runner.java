package com.xworkz.dependency;

import com.xworkz.dependency.config.PatientConfig;
import com.xworkz.dependency.patient.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PatientConfig.class);

        Patient patient = applicationContext.getBean(Patient.class);

        System.out.println(patient);

    }
}
