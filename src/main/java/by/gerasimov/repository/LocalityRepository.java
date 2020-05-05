package by.gerasimov.repository;

import by.gerasimov.model.Locality;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalityRepository extends CrudRepository<Locality, Long> {
    Optional<Locality> findById(Long id);
    List<Locality> findAll();
}
