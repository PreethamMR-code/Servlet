package com.xworkz.coffee.impl;

import com.xworkz.coffee.dto.CafeteriaDTO;
import com.xworkz.coffee.exception.InvalidDataException;
import com.xworkz.coffee.inter.Cafeteria;

public class CafeteriaImpl implements Cafeteria {

    @Override
    public void validateDetails(CafeteriaDTO cafeteriaDTO)throws InvalidDataException {

        System.out.println(cafeteriaDTO);
        boolean invalid = false;

        if (cafeteriaDTO != null) {

            if (cafeteriaDTO.getName() == null || cafeteriaDTO.getName().length() < 3) {
                invalid = true;
            } else if (cafeteriaDTO.getLocation() == null || cafeteriaDTO.getLocation().length() < 3) {
                invalid = true;
            } else if (cafeteriaDTO.getType() == null || cafeteriaDTO.getType().length() < 2) {
                invalid = true;
            } else if (cafeteriaDTO.getPrice() == null || cafeteriaDTO.getPrice().length() < 1) {
                invalid = true;
            } else if (cafeteriaDTO.getFranchise() == null || cafeteriaDTO.getFranchise().length() < 3) {
                invalid = true;
            } else if (cafeteriaDTO.getOwner() == null || cafeteriaDTO.getOwner().length() < 3) {
                invalid = true;
            } else if (cafeteriaDTO.getGst() == null || cafeteriaDTO.getGst().length() < 3) {
                invalid = true;
            }

            if (invalid) {
                throw new InvalidDataException("Invalid Cafeteria details");
            } else {
                System.out.println("Cafeteria details are valid!");
            }
        }
    }
}
