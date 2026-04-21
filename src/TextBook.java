public class TextBook extends Book{
    public String subject;
    public int edition;

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.edition = edition;
        this.subject = subject;
    }

    public void displayBookDetails() {
        System.out.println("isbn : "+isbn);
        System.out.println("title : "+title);
        System.out.println("author : "+author);
        System.out.println("subject : "+subject);
        System.out.println("edition : "+edition);
    }
}
