package devera.kits.database.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String name;
    public String address;
    public String phone;
    @Column(name = "created_date")
    public LocalDate createdDate;

    @JsonBackReference
    @OneToMany(mappedBy = "customer", cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    public Set<Product> products = new HashSet<>();

    public Customer() {
    }

    @PrePersist
    public void setProductRelation() {
        this.products.forEach(product -> {
            product.setCustomer(this);
        });
    }

    public void addProd(Product prod) {
        this.products.add(prod);
        prod.setCustomer(this);
    }
}
