package com.xworkz.dependency.state;


import com.xworkz.dependency.area.Area;
import com.xworkz.dependency.city.City;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Stateimpl implements State{

    @Value("karnataka")
    private String stateName;

    @Autowired
    City city;

    @Override
    public void addState() {
        System.out.println("add state ");
        city.addCity();

    }
}
