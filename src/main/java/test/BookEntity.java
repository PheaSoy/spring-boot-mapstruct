package test;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.time.Instant;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
@Entity
@ToString
public class BookEntity {
    @Id
    String id;
    String title;
    String author;
    Instant createdDate;
    String status;

    @PrePersist
    void beforeSave(){
        System.out.println("Pre persist");
        this.createdDate = Instant.now();
        this.status= "active";
    }
}
