package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;
import org.springframework.stereotype.Component;

@Component
public class SpecimenServiceStub implements ISpecimenService {
    public SpecimenDTO fetchBy(int id) {
        SpecimenDTO specimenDTO = new SpecimenDTO();
        specimenDTO.setSpecimenId(43);
        specimenDTO.setLatitude("40.75");
        specimenDTO.setLongitude("-75.60");
        specimenDTO.setDescription("A Beautiful Eastern Redbud");
        return specimenDTO;
    }

    public void save(SpecimenDTO specimenDTO) {
    }
}
