abstract public class User {
    String userId;
    private String name;
    private String contactInfo;
    static int totalUsers = 0;
    private static int idCounter = 0;

    public User() {
        this.userId = this.generateUniqueId();
        totalUsers++;
    }

    final public String generateUniqueId() {
        return String.valueOf(++idCounter);
    }

    User(String name, String contactInfo) {
        this.userId = this.generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }

    User(User obj) {
        this.userId = obj.userId;
        this.name = obj.name;
        this.contactInfo = obj.contactInfo;
        totalUsers++;
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

    public static int getTotalUsers() {
        return totalUsers;
    }

    abstract void displayDashboard();
    abstract boolean canBorrowBooks();
}
