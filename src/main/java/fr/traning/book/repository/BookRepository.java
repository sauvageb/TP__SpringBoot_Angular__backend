package fr.traning.book.repository;

import fr.traning.book.repository.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitleContaining(String title);

    List<Book> findByPublished(boolean published);
}
