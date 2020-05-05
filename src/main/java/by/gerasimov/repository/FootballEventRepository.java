package by.gerasimov.repository;

import by.gerasimov.model.FootballEvent;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballEventRepository extends CrudRepository<FootballEvent, Long> {
    List<FootballEvent> findByNameContaining(String name);
    Optional<FootballEvent> findById(Long id);
    List<FootballEvent> findAll();
}
