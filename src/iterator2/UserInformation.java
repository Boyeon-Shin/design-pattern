package iterator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserInformation {
    List<User> users = new ArrayList<User>();

    public void addUser(User user) {
        this.users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public Iterator<UserInfo> iterator() {
        return new UserIterator(users);
    }
}
