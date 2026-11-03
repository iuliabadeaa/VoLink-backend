package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.OrganizationMember;

public interface OrganizationMemberRepository
        extends JpaRepository<OrganizationMember, Long> {
}