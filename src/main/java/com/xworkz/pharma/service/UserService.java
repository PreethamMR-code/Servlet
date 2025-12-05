package com.xworkz.pharma.service;

import com.xworkz.pharma.dto.UserDto;
import com.xworkz.pharma.exception.InvalidException;

public interface UserService {

     void validateAndSave(UserDto userDto) throws InvalidException;

}
