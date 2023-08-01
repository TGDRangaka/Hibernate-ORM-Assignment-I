import entity.Book;
import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("B01", "Hero", "Mr.Kamal");

        Session session = FactoryConfig.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //save a book
        session.persist(book);

        //search book by ID
        Book book1 = session.get(Book.class, "B01");
        System.out.println(book1.toString());

        //update the book
        book.setAuthor("Mr.Akila");
        session.update(book);

        //delete a book
        session.remove(book);

        transaction.commit();

        session.close();
    }
}
