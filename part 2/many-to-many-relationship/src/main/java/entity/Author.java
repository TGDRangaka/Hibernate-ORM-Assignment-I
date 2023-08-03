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
public class Author {
    @Id
    private String authorId;
    private String name;
    private String address;
    private String contactNo;

    @ManyToMany
    private List<Book> books;

    public Author() {

    }

    public Author(String authorId, String name, String address, String contactNo) {
        this.authorId = authorId;
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
    }
}
