import java.util.ArrayList;
public class Library {
    private ArrayList<Books> books;
    private ArrayList<User> users;
    
    // Constructor
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }
    
    // Add user to library
    public void addUser(User user) {
    }
    
    // Delete user from library
    public boolean deleteUser(String userID) {
        return true;
    }
    
    // Print directory of all users
    public void printDirectory() {
    }
    
    // Checkout book to user
    public boolean checkoutBook(String userID, int bookID) {
        return true;
    }
    
    // Checkin book from user
    public boolean checkinBook(String userID, int bookID) {
        return true;
    }
    
    // Search books by name
    public ArrayList<Books> bookSearch(String searchTerm) {
        return new ArrayList<>();
    }
}
