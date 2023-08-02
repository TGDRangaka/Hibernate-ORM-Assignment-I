package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@ToString
public class Book {
    @Id
    private String bookId;
    private String title;
    private Double price;

    @OneToOne
    private Author author;

    public Book() {

    }

    public Book(String bookId, String title, Double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}
