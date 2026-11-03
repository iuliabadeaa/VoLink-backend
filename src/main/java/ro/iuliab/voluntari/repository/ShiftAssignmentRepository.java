package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.ShiftAssignment;

import java.util.List;

public interface ShiftAssignmentRepository
        extends JpaRepository<ShiftAssignment, Long> {

    List<ShiftAssignment> findByApplicationId(Long applicationId);

    List<ShiftAssignment> findByShiftId(Long shiftId);

    boolean existsByApplicationIdAndShiftId(
            Long applicationId,
            Long shiftId
    );
}