package by.gerasimov.controller;

import by.gerasimov.exception.ObjectNotFoundException;
import by.gerasimov.model.Locality;
import by.gerasimov.repository.LocalityRepository;
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
@RequestMapping("localities")
public class LocalityController {
    
    @Autowired
    private LocalityRepository repository;


    @GetMapping
    public List<Locality> getAll() {
        return repository.findAll();
    }

    @PostMapping
    Locality save(@RequestBody Locality newLocality) {
        return repository.save(newLocality);
    }

    @GetMapping("{id}")
    public Locality getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("locality", id));
    }

    @PutMapping("{id}")
    public Locality put(@RequestBody Locality newLocality, @PathVariable Long id) {
        newLocality.setId(id);
        repository.save(newLocality);
        return newLocality;
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
