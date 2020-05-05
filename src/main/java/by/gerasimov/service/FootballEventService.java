package by.gerasimov.service;

import by.gerasimov.exception.EventNotFoundException;
import by.gerasimov.model.FootballEvent;
import by.gerasimov.repository.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballEventService {

    @Autowired
    private EventRepository<FootballEvent> eventRepository;

    public FootballEvent findOne(Long id) {
        return eventRepository.findById(id).orElseThrow(() -> new EventNotFoundException(id));
    }

    public List<FootballEvent> findAll() {
        return eventRepository.findAll();
    }

    public FootballEvent save(FootballEvent newEvent) {
        return eventRepository.save(newEvent);
    }

    public FootballEvent put(FootballEvent newEvent, Long id) {
        newEvent.setId(id);
        eventRepository.save(newEvent);
        return newEvent;
    }

    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }
}
