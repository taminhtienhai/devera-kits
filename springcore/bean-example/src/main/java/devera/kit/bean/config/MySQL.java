package devera.kit.bean.config;

public class MySQL {
    String username = "admin";
    String password = "admin";

    public MySQL(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return this.username.concat(" ").concat(this.password);
    }
}
