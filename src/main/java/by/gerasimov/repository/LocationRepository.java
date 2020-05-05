package by.gerasimov.repository;

import by.gerasimov.model.Location;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
    Optional<Location> findById(Long id);
    List<Location> findAll();
}
