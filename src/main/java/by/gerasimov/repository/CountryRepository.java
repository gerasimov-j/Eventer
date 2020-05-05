package by.gerasimov.repository;

import by.gerasimov.model.Country;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
    Optional<Country> findById(Long id);
    List<Country> findAll();
}
