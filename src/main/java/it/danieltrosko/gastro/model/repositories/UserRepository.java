package it.danieltrosko.gastro.model.repositories;

import it.danieltrosko.gastro.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
