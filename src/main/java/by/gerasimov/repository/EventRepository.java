package by.gerasimov.repository;

import by.gerasimov.model.Event;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    List<Event> findByNameContaining(String name);
    Optional<Event> findById(Long id);
    List<Event> findAll();
}
