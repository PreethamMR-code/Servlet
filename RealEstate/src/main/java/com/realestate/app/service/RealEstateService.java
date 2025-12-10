package com.realestate.app.service;


import com.realestate.app.dto.RealEstateDTO;
import com.realestate.app.dto.SearchDTO;
import com.realestate.app.exception.RealEstateException;

import java.util.Optional;

public interface RealEstateService {

    void validateAndSave(RealEstateDTO realEstateDTO) throws RealEstateException;

    default Optional<RealEstateDTO> findByGmail (SearchDTO searchDTO){
        return Optional.empty();
    }
}
