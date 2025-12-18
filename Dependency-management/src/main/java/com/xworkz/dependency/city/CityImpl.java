package com.xworkz.dependency.city;

import com.xworkz.dependency.area.Area;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class CityImpl implements City{

    @Value("SHIMOGA")
    private String cityName;

    @Autowired
    Area area;

    @Override
    public void addCity() {
        System.out.println("add city");
        area.addArea();
    }



}
