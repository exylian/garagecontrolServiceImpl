package de.felixhoevel.application.repository;

import de.felixhoevel.application.domain.Garage;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Garage entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GarageRepository extends JpaRepository<Garage, Long> {

}
