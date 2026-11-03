package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.VolunteerProfile;

public interface VolunteerProfileRepository
        extends JpaRepository<VolunteerProfile, Long> {
}