package java.guru.springframework.spring5webapp.repositories;


import org.springframework.data.repository.CrudRepository;

import java.guru.springframework.spring5webapp.domain.Book;

/**
 * Created by jt on 12/23/19.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
