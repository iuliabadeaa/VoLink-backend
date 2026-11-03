package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.Organization;

public interface OrganizationRepository
        extends JpaRepository<Organization, Long> {
}