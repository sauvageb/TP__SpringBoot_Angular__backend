package fr.traning.book.service;

import fr.traning.book.controller.dto.BookDto;
import fr.traning.book.controller.dto.BookMapper;
import fr.traning.book.controller.dto.CreateBook;
import fr.traning.book.model.Book;
import fr.traning.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    public List<BookDto> fetchAllPublishedBooks() {
        return bookRepository.findByPublished(true)
                .stream()
                .map(book -> bookMapper.bookToBookDto(book))
                .collect(Collectors.toList());
    }

    public Optional<BookDto> searchSpecificBook(long id) {
        return bookRepository
                .findById(id)
                .map(book -> bookMapper.bookToBookDto(book));
    }

    public boolean removeAllBooks() {
        bookRepository.deleteAll();
        return true;
    }

    public boolean removeSpecificBook(long id) {
        bookRepository.deleteById(id);
        return true;
    }

    public BookDto createBook(CreateBook book) {
        Book newBook = bookMapper.createBookToBook(book);
        return bookMapper.bookToBookDto(bookRepository.save(newBook));
    }
}
