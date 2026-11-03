package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.VolunteerSkill;

import java.util.List;

public interface VolunteerSkillRepository
        extends JpaRepository<VolunteerSkill, Long> {

    List<VolunteerSkill> findByVolunteerProfileId(Long volunteerProfileId);

    boolean existsByVolunteerProfileIdAndSkillId(
            Long volunteerProfileId,
            Long skillId
    );
}