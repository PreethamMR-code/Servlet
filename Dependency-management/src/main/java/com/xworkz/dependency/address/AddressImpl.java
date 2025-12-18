package com.xworkz.dependency.address;

import com.xworkz.dependency.country.Country;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class AddressImpl implements Address {

    @Value("kvv shankaraghatta")
    private String address;

    @Autowired
    Country country;

    @Override
    public void addAddress() {


        System.out.println("add address method started");
        country.addCountry();

    }

}
