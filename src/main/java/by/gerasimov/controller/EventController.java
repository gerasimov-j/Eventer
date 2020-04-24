package by.gerasimov.controller;

import by.gerasimov.model.FootballEvent;
import by.gerasimov.service.EventService;
import by.gerasimov.service.FootballEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("event")
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private FootballEventService footballEventService;

    @GetMapping
    public String getAll() {
        return eventService.findAll().toString();
    }

    @GetMapping("football")
    public String getAllFootball() {
        return footballEventService.findAll().toString();
    }

    @GetMapping("{id}")
    public String getById(@PathVariable String id) {
        return eventService.findOne(id).toString();
    }

    @GetMapping("football/{id}")
    public String getFootballById(@PathVariable String id) {
        FootballEvent event = footballEventService.findOne(id);
        return event.toString();
    }
}
