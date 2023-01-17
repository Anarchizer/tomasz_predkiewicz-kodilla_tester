import java.util.Scanner;

public class Book {
    private String author;
    private String title;

    public Book (String author, String title){
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title) {
    Book book = new Book(title, author);
    return book;
    }
}
