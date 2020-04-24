package by.gerasimov.repository;

import by.gerasimov.model.Event;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository<E extends Event> extends CrudRepository<E, Long> {
    List<E> findByNameContaining(String name);
    Optional<E> findById(Long id);
    List<E> findAll();
}
