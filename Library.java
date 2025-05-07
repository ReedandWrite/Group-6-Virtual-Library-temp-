import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    private ArrayList<Person> people;
    
    public Library() {
        books = new ArrayList<>();
        people = new ArrayList<>();
    }
    
    public void addPerson(Person person) {
        people.add(person);
    }
    
    public boolean deletePerson(String personName) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(personName)) {
                people.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void printDirectory() {
        System.out.println("Library Users:");
        for (Person person : people) {
            System.out.println("- " + person.getName());
        }
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public boolean checkoutBook(String personName, int bookID) {
        Person person = findPerson(personName);
        Book book = findBook(bookID);
        
        if (person != null && book != null) {
            return person.checkOutBook(book);
        }
        return false;
    }
    
    public boolean checkinBook(String personName, int bookID) {
        Person person = findPerson(personName);
        Book book = findBook(bookID);
        
        if (person != null && book != null) {
            return person.returnBook(book);
        }
        return false;
    }
    
    public ArrayList<Book> bookSearch(String searchTerm) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookName() != null && book.getBookName().contains(searchTerm)) {
                results.add(book);
            }
        }
        return results;
    }
    
    private Person findPerson(String personName) {
        for (Person person : people) {
            if (person.getName().equals(personName)) {
                return person;
            }
        }
        return null;
    }
    
    private Book findBook(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }
    
    public ArrayList<Book> getAllBooks() {
        return books;
    }
}
