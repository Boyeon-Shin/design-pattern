package iterator2;

import java.util.Iterator;


//todo 제네릭으로 구현하기
public class Main {
    public static void main(String[] args) {
        UserInformation userInformation = new UserInformation();

        userInformation.addUser(new User("239932", "39839", "julias@email.com", "보연"));
        userInformation.addUser(new User("20040340", "283984", "anna@email.com", "안나"));

        print(userInformation.iterator());
    }

    public static void print(Iterator<UserInfo> iterator) {
        Iterator<UserInfo> iterator2 = iterator;

        while (iterator2.hasNext()) {
            UserInfo user = iterator2.next();
            System.out.println(user.getName());
            System.out.println(user.getEmail());
        }
    }
}
