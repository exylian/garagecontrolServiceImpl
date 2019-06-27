package de.felixhoevel.application.repository;

import de.felixhoevel.application.domain.Garage;
import de.felixhoevel.application.domain.GarageCode;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


/**
 * Spring Data  repository for the GarageCode entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GarageCodeRepository extends JpaRepository<GarageCode, Long> {

    List<GarageCode> findGarageCodesByGarageId(Garage garage);
    GarageCode findGarageCodeByGarageIdAndValidUntilIsAfter(Garage garage, LocalDate date);

}
