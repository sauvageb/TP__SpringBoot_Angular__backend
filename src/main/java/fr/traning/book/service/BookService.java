package fr.traning.book.service;

import fr.traning.book.controller.dto.BookDto;
import fr.traning.book.controller.dto.BookMapper;
import fr.traning.book.model.Book;
import fr.traning.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private BookMapper bookMapper;
    private BookRepository bookRepository;

    public BookService(BookMapper bookMapper, BookRepository bookRepository) {
        this.bookMapper = bookMapper;
        this.bookRepository = bookRepository;
    }

    public List<BookDto> searchAllBooks(String title) {
        List<Book> bookListResult = new ArrayList<>();
        if (title == null) {
            bookListResult = (List<Book>) this.bookRepository.findAll();
        } else {
            bookListResult = bookRepository.findByTitleContaining(title);
        }
        return bookListResult
                .stream()
                .map(book -> bookMapper.bookToBookDto(book))
                .collect(Collectors.toList());
    }
}
