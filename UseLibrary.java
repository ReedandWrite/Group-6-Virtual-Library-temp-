import java.util.ArrayList;
import java.util.Scanner;

public class UseLibrary {
    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean running = true;
        
        System.out.println("Welcome to the Group 6 Virtual Library!");
        
        while (running) {
            displayMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addUser();
                    break;
                case 3:
                    checkoutBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    searchBooks();
                    break;
                case 6:
                    viewAllBooks();
                    break;
                case 7:
                    viewAllUsers();
                    break;
                case 8:
                    deleteUser();
                    break;
                case 9:
                    running = false;
                    System.out.println("Thank you for using the Group 6 Library. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Book");
        System.out.println("2. Add User");
        System.out.println("3. Checkout Book");
        System.out.println("4. Return Book");
        System.out.println("5. Search Books");
        System.out.println("6. View All Books");
        System.out.println("7. View All Users");
        System.out.println("8. Delete User");
        System.out.println("9. Exit");
        System.out.println("====================================");
        System.out.print("Enter your choice: ");
    }
    
    private static int getUserChoice() {
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            return choice;
        } else {
            scanner.nextLine(); 
            return -1; 
        }
    }
    
    private static void addBook() {
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();
        
        System.out.print("Enter book ID: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid book ID. Please enter a number.");
            scanner.nextLine(); 
            return;
        }
        int bookID = scanner.nextInt();
        scanner.nextLine(); 
        
        Books newBook = new Books(bookName, bookID, "Available");
        library.addBook(newBook);
        System.out.println("Book added successfully: " + bookName);
    }
    
    private static void addUser() {

    
    private static void checkoutBook() {
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        
        System.out.print("Enter book ID: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid book ID. Please enter a number.");
            scanner.nextLine(); 
            return;
        }
        int bookID = scanner.nextInt();
        scanner.nextLine();
        
        if (library.checkoutBook(userName, bookID)) {
            System.out.println("Book checked out successfully!");
        } else {
            System.out.println("Unable to checkout book. Check if the user exists, book is available, or user hasn't reached their limit.");
        }
    }
    
    private static void returnBook() {
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        
        System.out.print("Enter book ID: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid book ID. Please enter a number.");
            scanner.nextLine();
            return;
        }
        int bookID = scanner.nextInt();
        scanner.nextLine();
        
        if (library.checkinBook(userName, bookID)) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Unable to return book. Check if the user has this book checked out.");
        }
    }
    
    private static void searchBooks() {
        System.out.print("Enter search term: ");
        String searchTerm = scanner.nextLine();
        
        ArrayList<Books> results = library.bookSearch(searchTerm);
        
        if (results.isEmpty()) {
            System.out.println("No books found matching: " + searchTerm);
        } else {
            System.out.println("\n===== SEARCH RESULTS =====");
            for (Books book : results) {
                System.out.println(book.getBookName() + " (ID: " + book.getBookID() + ") - " + book.getBookStatus());
            }
            System.out.println("=========================");
        }
    }
    
    private static void viewAllBooks() {
        ArrayList<Books> allBooks = library.getAllBooks();
        
        if (allBooks.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\n===== ALL BOOKS =====");
            for (Books book : allBooks) {
                System.out.println(book.getBookName() + " (ID: " + book.getBookID() + ") - " + book.getBookStatus());
            }
            System.out.println("====================");
        }
    }
    
    private static void viewAllUsers() {
        System.out.println("\n===== USER DIRECTORY =====");
        library.printDirectory();
        System.out.println("=========================");
    }
    
    private static void deleteUser() {
        System.out.print("Enter user name to delete: ");
        String userName = scanner.nextLine();
        
        if (library.deleteUser(userName)) {
            System.out.println("User deleted successfully: " + userName);
        } else {
            System.out.println("User not found: " + userName);
        }
    }
}
