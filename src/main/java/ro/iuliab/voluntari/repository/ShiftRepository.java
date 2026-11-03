package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Long> {
}