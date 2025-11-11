package oop;

public class UserMain {

    void main(){
        // Testing overloaded constructors of User class

        // Using Constructor 1
        User user1 = new User();
        System.out.println("User1: Guest: username: " + user1.username + ", email: " + user1.email + ", age: " + user1.age);

        // Using Constructor 3
        User user2 = new User("sdley", "sdley2020@gmail.com", "Souleymane DIALLO");
        System.out.println("User2: Admin: username: " + user2.username + ", email: " + user2.email + ", name: " + user2.name);
    }
}
