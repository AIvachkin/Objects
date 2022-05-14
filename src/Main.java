public class Main {

    public static void main(String[] args) {
        Author author = new Author("Лев", "Толстой") ;
        Author author1 = new Author("Федор", "Достоевский") ;
        Book book = new Book ("Война и Мир" , author.getFirstName() + " " + author.getLastName() , 2001) ;
        Book book1 = new Book("Преступление и наказание", author1.getFirstName() + " " + author1.getLastName(), 1999) ;
        System.out.println("book.title = " + book.getTitle());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.publishingYear = " + book.getPublishingYear());
        System.out.println("book1 .title = " + book1.getTitle());
        System.out.println("book1.author = " + book1.getAuthor());
        System.out.println("book1.publishingYear = " + book1.getPublishingYear());

        book.setPublishingYear(1980);
        System.out.println("book.getPublishingYear() = " + book.getPublishingYear());

    }

}

