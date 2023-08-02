import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("A01", "Mr.Amal Perera", "Panadura", "0123456789");
        Book book1 = new Book("B02", "Nature", 1000.0, author1);

        Book book2 = new Book("B03", "One Piece", 1250.00);
        Author author2 = new Author("A02", "Mr.Oda", "Japan", "0213456789");
        book2.setAuthor(author2);

        Session session = FactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(author1);
        session.persist(book1);

        session.persist(author2);
        session.persist(book2);

        transaction.commit();

        session.close();
    }
}
