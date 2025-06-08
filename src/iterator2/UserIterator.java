package iterator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserIterator implements Iterator<UserInfo> {
    private Iterator<UserInfo> user;


    public UserIterator(List<User> users) {
        List<UserInfo> userInfo = new ArrayList<>();
        for (User user : users) {
            userInfo.add(new UserInfo(user.getName(), user.getPassword()));
        }

        this.user = userInfo.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.user.hasNext();
    }

    @Override
    public UserInfo next() {
        return this.user.next();
    }
}
