package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;
import org.springframework.stereotype.Component;

@Component
public class SpecimenServiceStub {
    public SpecimenDTO fetchBy(int id) {
        SpecimenDTO specimenDTO = new SpecimenDTO();
        specimenDTO.setSpecimenId(43);
        return specimenDTO;
    }

    public void save(SpecimenDTO specimenDTO) {
    }
}
