package pl.sda.structure.map.library;

public class Book {

    private String isbnNumber;

    private BookType bookType;

    private String author;

    private String title;

    public Book(String isbnNumber, BookType bookType, String author, String title) {
        this.isbnNumber = isbnNumber;
        this.bookType = bookType;
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
