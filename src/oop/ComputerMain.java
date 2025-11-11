package oop;

public class ComputerMain {

    void main() {

        Computer computer1 = new Computer("Dell XPS 13", "Silver");
        Computer computer2 = new Computer("MacBook Pro", "Space Gray");
        Computer computer3 = new Computer("HP Spectre x360", "Black");

        Computer[] computers = {computer1, computer2, computer3};

        for (Computer computer : computers) {
            computer.turnOn();
        }
    }
}
