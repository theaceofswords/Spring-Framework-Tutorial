package tutorial.spring.webappdemo1.repository;

import org.springframework.data.repository.CrudRepository;
import tutorial.spring.webappdemo1.main.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher,Long> {
}
