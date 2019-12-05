package it.danieltrosko.gastro.model.repositories;

import it.danieltrosko.gastro.model.entities.Waitress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WaitressRepository extends JpaRepository<Waitress, Long> {
    Optional<Waitress> getWaitressById(Long id);
    Optional<Waitress> getWaitressByUsername(String username);
}
