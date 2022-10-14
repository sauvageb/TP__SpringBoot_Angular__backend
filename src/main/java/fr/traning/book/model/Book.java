package fr.traning.book.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "books")
@NoArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String pictureName;
    private String description;
    private String ISBN;
    private int nbPages;
    private double weight;
    private boolean published;
    private LocalDate publishingDate;

}
