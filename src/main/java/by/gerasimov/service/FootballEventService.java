package by.gerasimov.service;

import by.gerasimov.exception.NotFoundException;
import by.gerasimov.model.FootballEvent;
import by.gerasimov.repository.FootballEventRepository;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FootballEventService {

    @Autowired
    private FootballEventRepository eventRepository;

    public FootballEvent findOne(String id) {
        return eventRepository.findById(Long.valueOf(id)).orElseThrow(NotFoundException::new);
    }

    public List<FootballEvent> findAll() {
        return eventRepository.findAll();
    }
}
