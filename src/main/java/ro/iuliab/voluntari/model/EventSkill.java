package ro.iuliab.voluntari.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import ro.iuliab.voluntari.model.enums.ProficiencyLevel;

@Entity
@Table(
        name = "event_skills",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"event_id", "skill_id"}
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
public class EventSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;

    @Enumerated(EnumType.STRING)
    @Column(name = "required_level", nullable = false, length = 20)
    private ProficiencyLevel requiredLevel;
}