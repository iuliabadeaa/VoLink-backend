package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.EventSkill;

import java.util.List;

public interface EventSkillRepository
        extends JpaRepository<EventSkill, Long> {

    List<EventSkill> findByEventId(Long eventId);

    boolean existsByEventIdAndSkillId(Long eventId, Long skillId);
}