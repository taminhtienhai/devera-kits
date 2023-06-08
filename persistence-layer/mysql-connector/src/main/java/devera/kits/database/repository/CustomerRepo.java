package devera.kits.database.repository;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import devera.kits.database.model.Customer;
import jakarta.transaction.Transactional;

@Repository
public class CustomerRepo {
    private JdbcTemplate template;
    private SessionFactory sess;

    public CustomerRepo(JdbcTemplate template, SessionFactory sess) {
        this.template = template;
        this.sess = sess;
    }


    public List<Map<String, Object>> findById(int id) {
        return template.queryForList("select * from customer where id = ?", id);
    }
    
    @Transactional
    public List<Customer> all() {
        return this.sess.openSession()
            .createQuery("from Customer", Customer.class).list();
    }
}
