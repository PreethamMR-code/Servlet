package com.xworkz.coffee.dto;

import lombok.*;

import java.io.Serializable;


@Setter@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CoffeeLandDTO implements Serializable,Comparable {

    private String acre;
    private String plants;
    private String yield;
    private String expenditure;
    private String profit;
    private  String fertilizer;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
