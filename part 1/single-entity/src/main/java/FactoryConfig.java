import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfig {
    private static FactoryConfig factoryConfig;
    private SessionFactory sessionFactory;

    private FactoryConfig(){
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Book.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfig getInstance(){
        return factoryConfig == null ? (factoryConfig = new FactoryConfig()) : factoryConfig;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
