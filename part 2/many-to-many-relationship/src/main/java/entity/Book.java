package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@ToString
public class Book {
    @Id
    private String bookId;
    private String title;
    private Double price;

    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    public Book() {

    }

    public Book(String bookId, String title, Double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}
