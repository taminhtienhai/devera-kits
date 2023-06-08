package devera.kits.database.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devera.kits.database.model.Customer;
import devera.kits.database.repository.CustomerJPA;
import devera.kits.database.repository.CustomerRepo;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepo repo;
    private CustomerJPA cus;
    
    public CustomerController(CustomerRepo repo, CustomerJPA cus) {
        this.repo = repo;
        this.cus = cus;
    }

    @GetMapping
    public List<Map<String, Object>> index() {
        return repo.findById(1);
    }

    @GetMapping(value = "/all")
    public List<Customer> all() {
        return repo.all();
    }

    @GetMapping(value = "/search/{name}")
    public List<Customer> searchByName(@PathVariable("name") String name) {
        return cus.findByName(name);
    }
}
