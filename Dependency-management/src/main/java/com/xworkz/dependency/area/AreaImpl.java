package com.xworkz.dependency.area;

import com.xworkz.dependency.street.Street;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class AreaImpl implements Area{

    @Value("malenahlli")
    private String areaName;


    @Autowired
    Street street;

    @Override
    public void addArea() {
        System.out.println("add area");
        street.addStreet();

    }




}
