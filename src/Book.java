abstract public class Book implements Lendable{
    public String isbn;
    public String title;
    public String author;
    public boolean isAvailable;

    public Book() {
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book(Book book) {
        this.isbn = book.isbn;;
        this.title = book.title;
        this.author = book.author;
        this.isAvailable = book.isAvailable;
    }
    @Override
    public boolean lend(User user) {
        if(user.canBorrowBooks() && isAvailable)
            isAvailable = false;
        return true;
    }

    @Override
    public void returnBook(User user) {
        this.isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    abstract void displayBookDetails();
}
