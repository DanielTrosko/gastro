package it.danieltrosko.gastro.model.repositories;

import it.danieltrosko.gastro.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
