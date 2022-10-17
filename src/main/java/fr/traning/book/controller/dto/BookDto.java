package fr.traning.book.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BookDto {
    private long id;
    private String title;
    private String pictureUrl;
    private String description;
    private String ISBN;
    private int nbPages;
    private double weight;
    private boolean published;
    private LocalDate publishingDate;
}
