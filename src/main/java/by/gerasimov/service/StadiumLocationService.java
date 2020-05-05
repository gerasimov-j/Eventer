package by.gerasimov.service;

import by.gerasimov.exception.ObjectNotFoundException;
import by.gerasimov.model.StadiumLocation;
import by.gerasimov.repository.StadiumLocationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StadiumLocationService {

    @Autowired
    private StadiumLocationRepository repository;

    public StadiumLocation findOne(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("stadium", id));
    }

    public List<StadiumLocation> findAll() {
        return repository.findAll();
    }

    public StadiumLocation save(StadiumLocation newLocation) {
        return repository.save(newLocation);
    }

    public StadiumLocation put(StadiumLocation newLocation, Long id) {
        newLocation.setId(id);
        repository.save(newLocation);
        return newLocation;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
