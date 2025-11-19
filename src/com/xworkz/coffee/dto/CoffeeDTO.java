package com.xworkz.coffee.dto;

import lombok.*;

import java.io.Serializable;

    @Setter
    @Getter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
public class CoffeeDTO implements Serializable,Comparable {

        private String type;
        private String price;
        private String quantity;
        private String former;
        private String loc;

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
