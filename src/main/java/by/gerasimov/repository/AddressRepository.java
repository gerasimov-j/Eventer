package by.gerasimov.repository;

import by.gerasimov.model.Address;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
    Optional<Address> findById(Long id);
    List<Address> findAll();
}
