/*
 INFO-C211 | Group Project 
 Virtual Library: Phase 2
 Gina Valdez
 Member Class Stub | Represents a user who checks out books from the library.
*/

import java.util.ArrayList;

public class Person {

    // Person's name
    private String name;

    // Maximum number of books a person can check out
    private int maxBooks;

    // Number of books currently checked out by the person
    private ArrayList<Book> checkedOutBooks;


    // Constructor; Add person's name
    public Person(String name) {
    }

    // Constructor; sets name and a custom max book limit
    public Person(String name, int maxBooks) {
    }

    // Get the person's name
    public String getName() {
        return null;
    }


    // Update the person's name
    public void setName(String name) {
    }


    // See the list of checked out books
    public ArrayList<Book> getCheckedOutBooks() {
        return null;
    }


    // Getter method for number of books allowed to borrow in total
    public int getMaxBooks() {
        return 0;
    }


    // Setter method for the max book limit, which will be 5
    public void setMaxBooks(int maxBooks) {
    }


    // Function to check out a book
    public boolean checkOutBook(Book book) {
        return false;
    }

    
    // Function to return book
    public boolean returnBook(Book book) {
        return false;
    }
}