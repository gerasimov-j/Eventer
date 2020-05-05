package by.gerasimov.controller;

import by.gerasimov.model.Location;
import by.gerasimov.service.LocationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("locations")
public class LocationController {

    @Autowired
    private LocationService service;

    @GetMapping
    public List<Location> getAll() {
        return service.findAll();
    }

    @PostMapping
    Location save(@RequestBody Location newLocation) {
        return service.save(newLocation);
    }

    @GetMapping("{id}")
    public Location getById(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PutMapping("{id}")
    public Location put(@RequestBody Location newLocation, @PathVariable Long id) {
        return service.put(newLocation, id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
