package springframework.swpring5webapp.guru.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.swpring5webapp.guru.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
