package oop;

public class Friend {

    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void printTotalFriends() {
        System.out.println("You have " + numberOfFriends + " total friends.");
    }
}
