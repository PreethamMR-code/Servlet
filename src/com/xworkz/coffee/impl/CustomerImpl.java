package com.xworkz.coffee.impl;

import com.xworkz.coffee.dto.CustomerDTO;
import com.xworkz.coffee.exception.InvalidDataException;
import com.xworkz.coffee.inter.Customer;

public class CustomerImpl implements Customer {

    @Override
    public void validateDetails(CustomerDTO customerDTO)throws InvalidDataException {
        System.out.println(customerDTO);

        boolean invalid =false;

        if(customerDTO != null){

            if(customerDTO.getName() == null || customerDTO.getName().length()<3){
                invalid =true;
            }else if(customerDTO.getMobile() ==null || customerDTO.getMobile().length()<3){
                invalid =true;
            } else if (customerDTO.getFlavour() ==null  || customerDTO.getFlavour().length()<3) {
                invalid=true;
            } else if (customerDTO.getQuantity() ==null || customerDTO.getQuantity().length()<1) {
                invalid=true;
            }else if(customerDTO.getPayment() ==null  || customerDTO.getPayment().length()<1){
                invalid=true;
            }

            if(invalid){
                throw  new InvalidDataException("invalid");
            }else {
                System.out.println("Success");
            }
        }
    }
}
