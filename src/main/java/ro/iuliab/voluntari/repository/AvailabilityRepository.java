package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.Availability;

import java.util.List;

public interface AvailabilityRepository
        extends JpaRepository<Availability, Long> {

    List<Availability> findByApplicationId(Long applicationId);
}