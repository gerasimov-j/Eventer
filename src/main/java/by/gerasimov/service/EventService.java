package by.gerasimov.service;

import by.gerasimov.exception.EventNotFoundException;
import by.gerasimov.model.Event;
import by.gerasimov.repository.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository<Event> repository;

    public Event findOne(Long id) {
        return repository.findById(id).orElseThrow(() -> new EventNotFoundException(id));
    }

    public List<Event> findAll() {
        return repository.findAll();
    }

    public Event save(Event newEvent) {
        return repository.save(newEvent);
    }

    public Event put(Event newEvent, Long id) {
        newEvent.setId(id);
        repository.save(newEvent);
        return newEvent;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
