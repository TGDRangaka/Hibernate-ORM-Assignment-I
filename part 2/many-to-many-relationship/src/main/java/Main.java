import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("A01", "Mr.Amal Perera", "Panadura", "0123456789");
        Author author3 = new Author("A03", "Mrs.Kamani", "Horana", "0312456789");
        Author author2 = new Author("A02", "Mr.Oda", "Japan", "0213456789");

        List<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author3);

        List<Author> authors1 = new ArrayList<>();
        authors1.add(author2);

        Book book1 = new Book("B02", "Nature", 1000.0, authors);
        Book book2 = new Book("B03", "One Piece", 1250.00, authors1);
        Book book3 = new Book("B04", "Hero", 150.00, authors);

        List<Book> books1 = new ArrayList<>();
        books1.add(book1);
        books1.add(book3);

        List<Book> books2 = new ArrayList<>();
        books2.add(book2);

        author1.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books1);

        Session session = FactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();


        session.persist(author1);
        session.persist(author2);
        session.persist(author3);

        session.persist(book1);
        session.persist(book2);
        session.persist(book3);


        transaction.commit();

        session.close();
    }
}
