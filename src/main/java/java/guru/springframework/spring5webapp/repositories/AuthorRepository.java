package java.guru.springframework.spring5webapp.repositories;


import org.springframework.data.repository.CrudRepository;
import java.guru.springframework.spring5webapp.domain.Author;

/**
 * Created by jt on 12/23/19.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
