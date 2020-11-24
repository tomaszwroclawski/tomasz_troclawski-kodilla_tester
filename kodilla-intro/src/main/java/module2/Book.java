package module2;

public class Book {
    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book() {

    }


    public static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }

    public String getAuthorAndTitle() {
        return author + ": " + title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        Book book1 = Book.of("Author 1 name", "Title 1");
        Book book2 = Book.of("Author 2 name", "Title 2");

        System.out.println(book.getAuthorAndTitle());
        System.out.println(book1.getAuthorAndTitle());
        System.out.println(book2.getAuthorAndTitle());
        System.out.println(book.author);
        System.out.println(book.title);
        System.out.println(book.author + " " + book.title);
        System.out.println("        KONIEC 2.7");

    }

}


