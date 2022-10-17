package fr.traning.book.controller.dto;

import fr.traning.book.model.Book;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface BookMapper {

    BookDto bookToBookDto(Book book);

    Book createBookToBook(CreateBook book);
}
