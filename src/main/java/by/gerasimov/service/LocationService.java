package by.gerasimov.service;

import by.gerasimov.exception.ObjectNotFoundException;
import by.gerasimov.model.Location;
import by.gerasimov.repository.LocationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private LocationRepository repository;

    public Location findOne(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("location", id));
    }

    public List<Location> findAll() {
        return repository.findAll();
    }

    public Location save(Location newLocation) {
        return repository.save(newLocation);
    }

    public Location put(Location newLocation, Long id) {
        newLocation.setId(id);
        repository.save(newLocation);
        return newLocation;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
