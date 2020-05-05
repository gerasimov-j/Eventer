package by.gerasimov.controller;

import by.gerasimov.model.FootballEvent;
import by.gerasimov.service.FootballEventService;
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
@RequestMapping("events/football")
public class FootballEventController {

    @Autowired
    private FootballEventService footballEventService;

    @GetMapping
    public List<FootballEvent> getAll() {
        return footballEventService.findAll();
    }

    @GetMapping("{id}")
    public FootballEvent getById(@PathVariable Long id) {
        return footballEventService.findOne(id);
    }

    @PostMapping
    FootballEvent save(@RequestBody FootballEvent newEvent) {
        return footballEventService.save(newEvent);
    }

    @PutMapping("{id}")
    public FootballEvent put(@RequestBody FootballEvent newEvent, @PathVariable Long id) {
        return footballEventService.put(newEvent, id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        footballEventService.deleteById(id);
    }
}
