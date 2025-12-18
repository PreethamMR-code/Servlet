package com.xworkz.dependency.street;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class StreetImpl implements Street {

    @Value("basava area")
    private String streetName;

    @Override
    public void addStreet() {
        System.out.println(" add area");

    }

}
