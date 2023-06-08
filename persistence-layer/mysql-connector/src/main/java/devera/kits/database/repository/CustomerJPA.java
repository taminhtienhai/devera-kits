package devera.kits.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import devera.kits.database.model.Customer;

public interface CustomerJPA extends JpaRepository<Customer, Long> {
    List<Customer> findByName(String name);
}
