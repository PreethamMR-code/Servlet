package com.xworkz.coffee.inter;

import com.xworkz.coffee.dto.CoffeeDTO;
import com.xworkz.coffee.exception.InvalidDataException;

public interface CoffeeInterface {

   public void validateDetails(CoffeeDTO coffeeDTO)throws InvalidDataException;
}
