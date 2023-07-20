package devera.kits.database.repository;

import devera.kits.database.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductJPA extends JpaRepository<Product, Long> {
    
}
