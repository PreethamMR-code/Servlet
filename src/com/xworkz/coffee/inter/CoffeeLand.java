package com.xworkz.coffee.inter;

import com.xworkz.coffee.dto.CoffeeDTO;
import com.xworkz.coffee.dto.CoffeeLandDTO;
import com.xworkz.coffee.exception.InvalidDataException;

public interface CoffeeLand {
    public  void validateDetails(CoffeeLandDTO coffeeLandDTO)throws InvalidDataException;

}
