package com.xworkz.pharma.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable,Comparable<UserDto> {


    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private  int age;

    @Override
    public int compareTo(UserDto o) {
        return 0;
    }
}
