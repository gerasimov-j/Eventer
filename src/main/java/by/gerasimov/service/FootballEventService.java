package by.gerasimov.service;

import by.gerasimov.exception.EventNotFoundException;
import by.gerasimov.model.FootballEvent;
import by.gerasimov.repository.FootballEventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballEventService {

    @Autowired
    private FootballEventRepository repository;

    public FootballEvent findOne(Long id) {
        return repository.findById(id).orElseThrow(() -> new EventNotFoundException(id));
    }

    public List<FootballEvent> findAll() {
        return repository.findAll();
    }

    public FootballEvent save(FootballEvent newEvent) {
        return repository.save(newEvent);
    }

    public FootballEvent put(FootballEvent newEvent, Long id) {
        newEvent.setId(id);
        repository.save(newEvent);
        return newEvent;
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
