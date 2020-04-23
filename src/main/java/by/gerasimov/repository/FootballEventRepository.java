package by.gerasimov.repository;

import by.gerasimov.model.FootballEvent;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballEventRepository extends EventRepository<FootballEvent> {
    List<FootballEvent> findByNameContaining(String name);
}
