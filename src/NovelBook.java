public class NovelBook extends Book {
    public String genre;

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    public void displayBookDetails() {
        System.out.println("isbn : "+isbn);
        System.out.println("title : "+title);
        System.out.println("author : "+author);
        System.out.println("genre : "+genre);
    }
}
