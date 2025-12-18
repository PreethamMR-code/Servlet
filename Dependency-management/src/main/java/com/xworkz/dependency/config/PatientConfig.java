package com.xworkz.dependency.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.xworkz.dependency")
public class PatientConfig {

    public PatientConfig(){
        System.out.println("Patient config started");
    }
}
