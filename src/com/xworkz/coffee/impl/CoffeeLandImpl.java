package com.xworkz.coffee.impl;

import com.xworkz.coffee.dto.CoffeeLandDTO;
import com.xworkz.coffee.exception.InvalidDataException;
import com.xworkz.coffee.inter.CoffeeLand;

public class CoffeeLandImpl implements CoffeeLand {

    @Override
    public void validateDetails(CoffeeLandDTO coffeeLandDTO) throws InvalidDataException {

        System.out.println(coffeeLandDTO);
        boolean invalid = false;

        if (coffeeLandDTO != null) {

            if (coffeeLandDTO.getAcre() == null || coffeeLandDTO.getAcre().length() < 1) {
                invalid = true;
            } else if (coffeeLandDTO.getPlants() == null || coffeeLandDTO.getPlants().length() < 1) {
                invalid = true;
            } else if (coffeeLandDTO.getYield() == null || coffeeLandDTO.getYield().length() < 1) {
                invalid = true;
            } else if (coffeeLandDTO.getExpenditure() == null || coffeeLandDTO.getExpenditure().length() < 1) {
                invalid = true;
            } else if (coffeeLandDTO.getProfit() == null || coffeeLandDTO.getProfit().length() < 1) {
                invalid = true;
            } else if (coffeeLandDTO.getFertilizer() == null || coffeeLandDTO.getFertilizer().length() < 1) {
                invalid = true;
            }

            if (invalid) {
                throw new InvalidDataException("Invalid Coffee Land details");
            } else {
                System.out.println("Coffee Land details are valid!");
            }
        }
    }
}
