package devera.kits.database.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import devera.kits.database.model.CustomData;
import devera.kits.database.model.Customer;

public interface CustomerJPA extends JpaRepository<Customer, Long> {
    List<Customer> findByName(String name);


    @Query(value = "select * from Customer c inner join Product p on c.id = p.customer_id", nativeQuery = true)
    List<CustomData> complexQuery();
}
