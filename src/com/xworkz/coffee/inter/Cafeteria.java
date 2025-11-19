package com.xworkz.coffee.inter;

import com.xworkz.coffee.dto.CafeteriaDTO;
import com.xworkz.coffee.dto.CoffeeDTO;
import com.xworkz.coffee.exception.InvalidDataException;

public interface Cafeteria {

    public void validateDetails(CafeteriaDTO cafeteriaDTO)throws InvalidDataException;
}


