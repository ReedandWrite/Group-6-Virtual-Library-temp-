/*
 INFO-C211 | Group Project 
 Virtual Library: Phase 3
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


    // Constructor; sets name and a custom max book limit
    public Person(String name) {
        this.name = name;
        this.maxBooks = 5;
        this.checkedOutBooks = new ArrayList<>();
    }

    // Get the person's name
    public String getName() {
        return name;
    }


    // Update the person's name
    public void setName(String name) {
        this.name = name;
    }


    // See the list of checked out books
    public ArrayList<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }


    // Getter method for number of books allowed to borrow in total
    public int getMaxBooks() {
        return maxBooks;
    }


    // Setter method for the max book limit, which will be 5
    public void setMaxBooks(int maxBooks) {
        this.maxBooks = maxBooks;
    }


    // Function to check out a book
    public boolean checkOutBook(Book book) {
        if (checkedOutBooks.size() < maxBooks && !book.getBookStatus()) {
            checkedOutBooks.add(book);
            book.borrowed();
            return true;
        }
        return false;
    }

    
    // Function to return book
    public boolean returnBook(Book book) {
        if (checkedOutBooks.contains(book)) {
            checkedOutBooks.remove(book);
            book.returned();
            return true;
        }
        return false;
    }
}
