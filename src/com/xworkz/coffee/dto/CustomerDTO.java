package com.xworkz.coffee.dto;

import lombok.*;

import java.io.Serializable;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDTO implements Serializable,Comparable {

    private String name;
    private String mobile;
    private String flavour;
    private String quantity;
    private String payment;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
