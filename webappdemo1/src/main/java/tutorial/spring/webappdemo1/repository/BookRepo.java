package tutorial.spring.webappdemo1.repository;

import org.springframework.data.repository.CrudRepository;
import tutorial.spring.webappdemo1.main.Book;

public interface BookRepo extends CrudRepository<Book,Long> {
}
