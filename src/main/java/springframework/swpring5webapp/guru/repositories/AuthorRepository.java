package springframework.swpring5webapp.guru.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.swpring5webapp.guru.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
