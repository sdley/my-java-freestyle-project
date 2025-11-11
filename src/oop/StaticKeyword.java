package oop;

public class StaticKeyword {

    // static: Used to declare class-level variables and methods.
    //         Makes a variable or method belong to the class rather than to any specific instance.
    //         Shared among all instances of the class.
    //         Useful for defining constants or utility methods that don't require instance-specific data.

    void main() {
        Friend friend1 = new Friend("Alice");
        Friend friend2 = new Friend("Bob");
        Friend friend3 = new Friend("Charlie");

        System.out.println("Total number of friends: " + Friend.numberOfFriends);
        Friend.printTotalFriends();
    }


}
