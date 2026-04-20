abstract public class User {
    String userId;
    private String name;
    private String contactInfo;

    public User() {
        this.userId = this.generateUniqueId();
    }

    public string generateUniqueId() {
        return "0";
    }

    User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User obj) {
        this.userId = obj.userId;
        this.name = obj.name;
        this.contactInfo = obj.contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    abstract void displayDashboard();
    abstract boolean canBorrowBooks();
}
