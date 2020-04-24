package by.gerasimov.service;

import by.gerasimov.exception.NotFoundException;
import by.gerasimov.model.Event;
import by.gerasimov.repository.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository<Event> eventRepository;

    public Event findOne(String id) {
        return eventRepository.findById(Long.valueOf(id)).orElseThrow(NotFoundException::new);
    }

    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
