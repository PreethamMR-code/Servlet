package com.xworkz.coffee.dto;

import lombok.*;

import java.io.Serializable;

@Setter@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CafeteriaDTO implements Serializable,Comparable {

        private String name;
        private String location;
        private String type;
        private String price;
        private String franchise;
        private String owner;
        private String gst;


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
