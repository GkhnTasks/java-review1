package FunctiomalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {
        List<User> users= new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").age(35).build());
        users.add(User.builder().firstName("Tom").lastName("Hanks").age(20).build());
        users.add(User.builder().firstName("George").lastName("GG").age(50).build());
        //Print all elements in the list
        printName(users,p->true);

        //Print all users that last name starts with G

        printName(users,user->user.getLastName().startsWith("G"));
    }

    private static  void printName(List<User> users, Predicate<User> p){

        for (User user:users){

            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
