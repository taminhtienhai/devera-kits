package devera.kits.database.controller;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devera.kits.database.model.CustomData;
import devera.kits.database.model.Customer;
import devera.kits.database.model.Pagination;
import devera.kits.database.model.Product;
import devera.kits.database.repository.CustomerJPA;
import devera.kits.database.repository.CustomerRepo;
import devera.kits.database.repository.ProductJPA;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepo repo;
    private CustomerJPA cus;
    private ProductJPA prod;
    private TransactionTemplate trx;
    private SessionFactory sess;

    @GetMapping
    public List<Map<String, Object>> index() {
        return repo.findById(1);
    }

    // @Transactional
    @PostMapping
    public Customer saveProducts() {
        var cus = new Customer();
        var prod01 = new Product();
        var prod02 = new Product();

        cus.addProd(prod01);
        cus.addProd(prod02);
        // cus.setProducts(Set.of(prod01, prod02));
        // var session = sess.openSession();
        // var trx = session.beginTransaction();

        // try {
        // session.persist(cus);
        // // var rs = this.cus.save(cus);
        // session.persist(prod01);
        // // if (true) {
        // //     throw new RuntimeException("Error");
        // // }
        // session.persist(prod02);
        // trx.commit();
        // } catch (Exception e) {
        //     trx.rollback();
        // }


        // this.cus.save(cus);
        // this.prod.save(prod01);
        // this.prod.save(prod02);

        // return trx.execute((status) -> {
        //     var rs = this.cus.save(cus);
        //     this.prod.save(prod01);
        //     if (true) {
        //         throw new RuntimeException("Error");
        //     }
        //     this.prod.save(prod02);
        //     return rs;
        // });

        return this.cus.save(cus);
    }

    @GetMapping(value = "/all")
    public List<Customer> all() {
        return repo.all();
    }

    @PostMapping(value = "/all")
    public List<Customer> pagination(@RequestBody Pagination pg) {
        PageRequest request = PageRequest.of(
            pg.getPage(),
            pg.getLimit(),
            Sort.by(List.of(Order.asc("createdDate"), Order.desc("name"))
        ));
        return this.cus.findAll(request).getContent();
    }

    @GetMapping("/complex")
    public List<CustomData> complex() {
        return this.cus.complexQuery();
    }

    @GetMapping(value = "/search/{name}")
    public List<Customer> searchByName(@PathVariable("name") String name) {
        return cus.findByName(name);
    }
}
