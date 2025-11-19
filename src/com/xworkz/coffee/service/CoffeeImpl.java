package com.xworkz.coffee.service;

import com.xworkz.coffee.dto.CoffeeDTO;

public class CoffeeImpl implements CoffeeInterface{


    @Override
    public void validateDetails(CoffeeDTO coffeeDTO) {
        System.out.println(coffeeDTO);

    }
}
