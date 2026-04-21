import java.util.List;

public class LibraryManagementSystem {
    List<Book> bookInventory;
    List<User> registeredUsers;

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }
}
