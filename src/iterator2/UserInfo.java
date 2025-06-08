package iterator2;

public class UserInfo {
    private String name;
    private String email;

    public UserInfo(final String name, final String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
