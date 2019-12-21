package it.danieltrosko.gastro.model.repositories;

import it.danieltrosko.gastro.model.entities.Tables;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Tables, Long> {
}
