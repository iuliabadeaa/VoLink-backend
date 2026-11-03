package ro.iuliab.voluntari.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import ro.iuliab.voluntari.model.enums.ProficiencyLevel;

@Entity
@Table(
        name = "volunteer_skills",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"volunteer_profile_id", "skill_id"}
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
public class VolunteerSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "volunteer_profile_id", nullable = false)
    private VolunteerProfile volunteerProfile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Enumerated(EnumType.STRING)
    @Column(name = "proficiency_level", nullable = false, length = 20)
    private ProficiencyLevel proficiencyLevel;
}