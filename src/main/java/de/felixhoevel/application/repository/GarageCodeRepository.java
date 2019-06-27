package de.felixhoevel.application.repository;

import de.felixhoevel.application.domain.GarageCode;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the GarageCode entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GarageCodeRepository extends JpaRepository<GarageCode, Long> {

}
