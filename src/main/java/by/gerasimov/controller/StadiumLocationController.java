package by.gerasimov.controller;

import by.gerasimov.model.StadiumLocation;
import by.gerasimov.service.StadiumLocationService;
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
@RequestMapping("locations/stadiums")
public class StadiumLocationController {

    @Autowired
    private StadiumLocationService service;

    @GetMapping
    public List<StadiumLocation> getAll() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public StadiumLocation getById(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PostMapping
    StadiumLocation save(@RequestBody StadiumLocation newEvent) {
        return service.save(newEvent);
    }

    @PutMapping("{id}")
    public StadiumLocation put(@RequestBody StadiumLocation newEvent, @PathVariable Long id) {
        return service.put(newEvent, id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
