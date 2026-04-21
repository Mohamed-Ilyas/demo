abstract public class Book implements Lendable{
    public String isbn;
    public String title;
    public String author;
    public boolean isAvailable;

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
