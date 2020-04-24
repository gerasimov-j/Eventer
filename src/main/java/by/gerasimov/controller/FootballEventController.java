package by.gerasimov.controller;

import by.gerasimov.model.FootballEvent;
import by.gerasimov.service.FootballEventService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
