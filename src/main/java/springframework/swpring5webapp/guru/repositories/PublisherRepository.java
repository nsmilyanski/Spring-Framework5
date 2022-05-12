package springframework.swpring5webapp.guru.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.swpring5webapp.guru.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
