package by.gerasimov.controller;

import by.gerasimov.exception.ObjectNotFoundException;
import by.gerasimov.model.Address;
import by.gerasimov.repository.AddressRepository;
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
@RequestMapping("addresses")
public class AddressController {
    
    @Autowired
    private AddressRepository repository;


    @GetMapping
    public List<Address> getAll() {
        return repository.findAll();
    }

    @PostMapping
    Address save(@RequestBody Address newAddress) {
        return repository.save(newAddress);
    }

    @GetMapping("{id}")
    public Address getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("address", id));
    }

    @PutMapping("{id}")
    public Address put(@RequestBody Address newAddress, @PathVariable Long id) {
        newAddress.setId(id);
        repository.save(newAddress);
        return newAddress;
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
