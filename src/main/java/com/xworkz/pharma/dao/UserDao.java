package com.xworkz.pharma.dao;

import com.xworkz.pharma.dto.UserDto;

public interface UserDao {

    boolean save(UserDto userDto);
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);
}
