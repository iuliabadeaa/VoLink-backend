package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}