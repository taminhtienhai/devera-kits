package devera.kits.database.repository;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import devera.kits.database.model.Customer;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Repository
public class CustomerRepo {
    private JdbcTemplate template;
    private SessionFactory sess;

    public List<Map<String, Object>> findById(int id) {
        return template.queryForList("select * from customer where id = ?", id);
    }
    
    @Transactional
    public List<Customer> all() {
        var session = this.sess.openSession();

        var trx = session.beginTransaction();
        return this.sess.openSession()
            .createQuery("from Customer", Customer.class).list();
    }
}
