package com.xworkz.dependency.country;

import com.xworkz.dependency.state.State;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class CountryImpl implements Country{

    @Value("INDIA")
    private String countryName;

    @Autowired
    State state;


    @Override
    public void addCountry() {
        System.out.println("country method ");

        state.addState();

    }


}
