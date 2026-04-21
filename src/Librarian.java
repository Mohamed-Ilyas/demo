public class Librarian extends User {
    String employeeNumber;

    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("employeeNumber: " + employeeNumber);
    }

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {

    }

    void removeBook(Book book) {

    }
}
