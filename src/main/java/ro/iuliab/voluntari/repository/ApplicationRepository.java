package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.Application;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    List<Application> findByVolunteerProfileId(Long volunteerProfileId);

    List<Application> findByEventId(Long eventId);

    boolean existsByVolunteerProfileIdAndEventId(
            Long volunteerProfileId,
            Long eventId
    );
}