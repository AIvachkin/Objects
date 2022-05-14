public class Book {
    private final String title ;
    private final String author ;
    private int publishingYear ;

    public Book(String title, String author, int publishingYear) {
        this.title = title ;
        this.author = author ;
        this.publishingYear = publishingYear ;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear ;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
