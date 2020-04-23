package by.gerasimov.service;

import by.gerasimov.model.Event;
import by.gerasimov.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository<Event> repository;

}
