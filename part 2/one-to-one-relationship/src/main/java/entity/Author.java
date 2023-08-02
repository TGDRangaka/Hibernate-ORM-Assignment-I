package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

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

    public Author() {

    }
}
