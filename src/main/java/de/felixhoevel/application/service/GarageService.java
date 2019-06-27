package de.felixhoevel.application.service;

import de.felixhoevel.application.domain.Garage;
import de.felixhoevel.application.domain.GarageCode;
import de.felixhoevel.application.repository.GarageCodeRepository;
import de.felixhoevel.application.repository.GarageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link Garage}.
 */
@Service
@Transactional
public class GarageService {

    private final Logger log = LoggerFactory.getLogger(GarageService.class);

    private final GarageRepository garageRepository;

    @Autowired
    private GarageCodeRepository garageCodeRepository;

    public GarageService(GarageRepository garageRepository) {
        this.garageRepository = garageRepository;
    }

    /**
     * Save a garage.
     *
     * @param garage the entity to save.
     * @return the persisted entity.
     */
    public Garage save(Garage garage) {
        log.debug("Request to save Garage : {}", garage);
        return garageRepository.save(garage);
    }

    /**
     * Get all the garages.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<Garage> findAll() {
        log.debug("Request to get all Garages");
        return garageRepository.findAll();
    }


    /**
     * Get one garage by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Garage> findOne(Long id) {
        log.debug("Request to get Garage : {}", id);
        return garageRepository.findById(id);
    }

    /**
     * Delete the garage by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Garage : {}", id);
        garageRepository.deleteById(id);
    }

    /**
     *
     * Check a Garage if there ist at least one ayctive code
     *
     * @param id of the Garage
     * @return boolean
     */
    public boolean garageActiveQuery(Long id){
        log.debug("Request to check if the Garage got one or more active Codes");
        Garage garage = garageRepository.getOne(id);
       
        GarageCode garageCode = garageCodeRepository.findGarageCodeByGarageIdAndValidUntilIsAfter(garage, LocalDate.now().minusDays(1));
        if (garageCode != null){return true;}
        return false;
    }
}
