package erika.entities;

public class Book extends CatalogElement {

    private String author;
    private String genre;


    public Book(int isbn, String title, int publishedDate, int pages, String author, String genre) {
        super(isbn, title, publishedDate, pages);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book: " +
                "author: '" + author + '\'' +
                ", genre:'" + genre + '\'' +
                "isbn: " + getIsbn() +
                ", title: '" + getTitle() + '\'' +
                ", publishedDate: " + getPublishedDate() +
                ", pages: " + getPages();
    }
}
