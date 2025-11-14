package oop;

public class Aggregation {

    // Aggregation: A class contains a reference to another class as a part of its state.
    //              One object "has-a" relationship with another object.
    //              One object contains another object as a part of its structure
    //             but the contained object can exist independently of the container object.

    void main() {

        Book book1 = new Book("The fellowship of the Ring", 423);
        Book book2 = new Book("The two towers", 352);
        Book book3 = new Book("The return of the King", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("City Library", 1995, books);

        library.displayBooks();
    }

}
