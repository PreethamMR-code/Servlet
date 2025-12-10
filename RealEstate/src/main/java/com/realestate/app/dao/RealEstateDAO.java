package com.realestate.app.dao;

import com.realestate.app.dto.RealEstateDTO;

import java.util.Optional;

public interface RealEstateDAO {

    boolean save(RealEstateDTO realEstateDTO);
    boolean existsByEmail(String email);

    default Optional<RealEstateDTO> findByEmail(String gmail){
        return Optional.empty();
    }
}
