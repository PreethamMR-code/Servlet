package com.realestate.app.service;

import com.realestate.app.dao.RealEstateDAO;
import com.realestate.app.dao.RealEstateDAOImpl;
import com.realestate.app.dto.RealEstateDTO;
import com.realestate.app.dto.SearchDTO;
import com.realestate.app.exception.RealEstateException;
import com.sun.org.apache.regexp.internal.RE;

import java.util.Optional;

public class RealEstateServiceImpl implements RealEstateService{

    RealEstateDAO realEstateDAO = new RealEstateDAOImpl();


    @Override
    public void validateAndSave(RealEstateDTO realEstateDTO) throws RealEstateException {

        boolean invalid =false;

        if(realEstateDTO == null){
            throw new RealEstateException("data is null");
        }

        if(realEstateDTO.getFullName() == null || realEstateDTO.getFullName().trim().length()< 4){
            invalid = true;
        }

        if(realEstateDTO.getEmail() == null || !realEstateDTO.getEmail().contains("@")){
            invalid = true;
        }

        if(realEstateDTO.getPropertyType() ==null || realEstateDTO.getPropertyType().isEmpty()){
            invalid =true;
        }

        if(realEstateDTO.getBudget() <= 0){
            invalid = true;
        }

        if(realEstateDTO.getMessage() == null || realEstateDTO.getMessage().length() < 5){
            invalid = true;
        }

        if(invalid){
            throw  new RealEstateException("DATA is not valid");
        }

        //for email
        boolean exists = realEstateDAO.existsByEmail(realEstateDTO.getEmail());
        if(exists){
            throw new RealEstateException("email already registered");
        }

        boolean saved = realEstateDAO.save(realEstateDTO);
        System.out.println("Saved:"+ saved);
    }

    @Override
    public Optional<RealEstateDTO> findByGmail(SearchDTO searchDTO) {

        String mail = searchDTO.getEmailID();
        boolean invalid = false;

        if(mail == null || !mail.contains("@"))
        {
            System.err.println("mail is not valid..");
            invalid = true;
        }

        if(!invalid)
        {
            System.out.println("mail is valid call dao..");
            Optional<RealEstateDTO> optionalRealEstateDTO = this.realEstateDAO.findByEmail(mail);
            System.out.println("optional real estate:"+optionalRealEstateDTO.isPresent());
            return optionalRealEstateDTO;

        }
        return RealEstateService.super.findByGmail(searchDTO);
    }
}
