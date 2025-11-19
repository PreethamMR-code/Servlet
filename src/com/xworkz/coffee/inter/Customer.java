package com.xworkz.coffee.inter;

import com.xworkz.coffee.dto.CoffeeLandDTO;
import com.xworkz.coffee.dto.CustomerDTO;
import com.xworkz.coffee.exception.InvalidDataException;

public interface Customer {

    public void validateDetails(CustomerDTO customerDTO)throws InvalidDataException;
}
