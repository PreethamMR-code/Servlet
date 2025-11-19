package com.xworkz.coffee.impl;

import com.xworkz.coffee.dto.CoffeeDTO;
import com.xworkz.coffee.exception.InvalidDataException;
import com.xworkz.coffee.inter.CoffeeInterface;

public class CoffeeImpl implements CoffeeInterface {


    @Override
    public void validateDetails(CoffeeDTO coffeeDTO) throws InvalidDataException {
        System.out.println(coffeeDTO);
        boolean invalid = false;
        if (coffeeDTO !=null){

            if (coffeeDTO.getFormer() ==null || coffeeDTO.getFormer().length() <3 ){
                invalid=true;
            } else if (coffeeDTO.getLoc() ==null || coffeeDTO.getLoc().length() < 3) {
                invalid=true;
            } else if (coffeeDTO.getType() == null || coffeeDTO.getType().length() <3) {
                invalid=true;
            }else if (coffeeDTO.getPrice()  == null || coffeeDTO.getPrice().length() <1){
                invalid=true;
            }else if(coffeeDTO.getQuantity() == null || coffeeDTO.getQuantity().length() <1){
                invalid=true;
            }

            if (invalid){
                throw new  InvalidDataException("invalid last");
            }else {
                System.out.println("success");
            }

        }


    }
}
