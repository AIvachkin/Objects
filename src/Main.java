public class Main {

    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой") ;
        Author author1 = new Author("Федор", "Достоевский") ;
        Book book = new Book ("Война и Мир" , author , 2001) ;
        Book book1 = new Book("Преступление и наказание", author1, 1999) ;
        System.out.println("book.title = " + book.getTitle());
        System.out.println("book.author = " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println("book.publishingYear = " + book.getPublishingYear());
        System.out.println("book1 .title = " + book1.getTitle());
        System.out.println("book1.author = " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("book1.publishingYear = " + book1.getPublishingYear());

        book.setPublishingYear(1980);
        System.out.println("book.getPublishingYear() = " + book.getPublishingYear());

    }

}

