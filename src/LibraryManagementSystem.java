import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    static List<Book> bookInventory = new ArrayList<>();
    List<User> registeredUsers = new ArrayList<>();

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    static public List<Book> searchBooks(String criteria) {
        List<Book> results = new ArrayList<>();
        String lowerCase = criteria.toLowerCase();

        for(Book book : bookInventory) {
            if(book.author.toLowerCase().contains(lowerCase) || book.title.toLowerCase().contains(lowerCase)) {
                results.add(book);
            }
        }
        return results;
    }
}
