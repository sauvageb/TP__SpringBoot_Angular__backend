package fr.traning.book.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String pictureUrl;
    @Column(name = "description", columnDefinition = "LONGTEXT")
    private String description;
    private String ISBN;
    private int nbPages;
    private double weight;
    private boolean published;
    private LocalDate publishingDate;

}
