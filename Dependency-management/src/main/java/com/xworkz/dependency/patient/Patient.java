package com.xworkz.dependency.patient;

import com.xworkz.dependency.address.Address;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Patient {

    @Value("1")
    private  int id;

    @Value("ABC")
    private String name;


    @Autowired
    Address address;

}
