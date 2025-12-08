package com.xworkz.pharma.service;


import com.xworkz.pharma.dto.SearchDTo;
import com.xworkz.pharma.dto.UserDto;
import com.xworkz.pharma.exception.InvalidException;

import java.util.Optional;

public interface UserService {

     void validateAndSave(UserDto userDto) throws InvalidException;

     default Optional<UserDto> findByPhone(SearchDTo searchDTo){
          return Optional.empty();
     }

}
