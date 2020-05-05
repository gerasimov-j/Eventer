package by.gerasimov.repository;

import by.gerasimov.model.StadiumLocation;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StadiumLocationRepository extends CrudRepository<StadiumLocation, Long> {
    Optional<StadiumLocation> findById(Long id);
    List<StadiumLocation> findAll();
}
