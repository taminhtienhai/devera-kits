package devera.kits.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    JdbcTemplate tmp;

    public UserService(JdbcTemplate tmp) {
        this.tmp = tmp;
    }

    public Map<?,?> getByUserName(String username) {
        var result = tmp.queryForList("select id, username, password from `user` where username = ?", username);
        return result.get(0);
    }

    public List<?> getAll() {
        return tmp.queryForList("select * from `user`");
    }
}
