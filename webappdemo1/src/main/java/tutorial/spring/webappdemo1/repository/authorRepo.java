package tutorial.spring.webappdemo1.repository;

import org.springframework.data.repository.CrudRepository;
import tutorial.spring.webappdemo1.main.Author;

public interface authorRepo extends CrudRepository<Author,Long> {
}
