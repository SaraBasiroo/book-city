package products;

public class Book extends Product{
    private static int BASE = 10001;
    private String author;
    private String publication;
    private String genre;

    public Book(String title, Double price, String author, String genre, String publication) {
        super(title, price);
        this.author = author;
        this.genre = genre;
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    protected String generateId() {
        int id = BASE + 1;
        BASE += 1;
        return  1 + String.valueOf(id);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", author = '" + author + '\'' +
                ", publication = '" + publication + '\'' +
                ", genre = '" + genre + '\'' + ' '
                ;
    }
}
