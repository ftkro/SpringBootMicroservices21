package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

/**
 * CRUD operations for specimen
 *
 * @author takurof
 */
public interface ISpecimenService {
    /**
     * Get specimens from persistence layer
     *
     * @param id a unique lookup
     * @return a specimen with a matching id
     */
    SpecimenDTO fetchBy(int id);

    /**
     * Persist the given DTO
     *
     * @param specimenDTO specimenDTO
     */
    void save(SpecimenDTO specimenDTO);
}
