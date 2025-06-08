package iterator2;

public class User {
    private String name;
    private String email;
    private String password;
    private String identity;

    public User(final String identity, final String password, final String email, final String name) {
        this.identity = identity;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(final String identity) {
        this.identity = identity;
    }
}
