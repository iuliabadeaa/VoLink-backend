package ro.iuliab.voluntari.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.iuliab.voluntari.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}