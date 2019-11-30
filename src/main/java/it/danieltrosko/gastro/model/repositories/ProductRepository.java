package it.danieltrosko.gastro.model.repositories;

import it.danieltrosko.gastro.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
