package by.gerasimov.controller;

import by.gerasimov.model.Event;
import by.gerasimov.service.EventService;
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
@RequestMapping("events")
public class EventController {

    @Autowired
    private EventService service;

    @GetMapping
    public List<Event> getAll() {
        return service.findAll();
    }

    @PostMapping
    Event newEmployee(@RequestBody Event newEvent) {
        return service.save(newEvent);
    }

    @GetMapping("{id}")
    public Event getById(@PathVariable Long id) {
        return service.findOne(id);
    }

    @PutMapping("{id}")
    public Event put(@RequestBody Event newEvent, @PathVariable Long id) {
        return service.put(newEvent, id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
