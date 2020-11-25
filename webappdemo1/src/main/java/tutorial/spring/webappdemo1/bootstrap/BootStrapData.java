package tutorial.spring.webappdemo1.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tutorial.spring.webappdemo1.main.Author;
import tutorial.spring.webappdemo1.main.Book;
import tutorial.spring.webappdemo1.main.Publisher;
import tutorial.spring.webappdemo1.repository.BookRepo;
import tutorial.spring.webappdemo1.repository.PublisherRepo;
import tutorial.spring.webappdemo1.repository.authorRepo;

@Component
public class BootStrapData implements CommandLineRunner {

    private final authorRepo authorrepo;
    private final BookRepo bookRepo;
    private final PublisherRepo publisherRepo;

    public BootStrapData(authorRepo authorrepo, BookRepo bookRepo, PublisherRepo publisherRepo){
        this.authorrepo = authorrepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("pubs");
        publisher.setCity("xzy");
        publisher.setState("sss");
        publisher.setStreet("jordan");
        publisher.setZip("2342");

        publisherRepo.save(publisher);

        Author eric = new Author("Eric","Evans");
        Book book1 = new Book("Domain Driven design","12323412");
        eric.getBooks().add(book1);
        book1.getAuthors().add(eric);
        publisher.getBooks().add(book1);

        authorrepo.save(eric);
        bookRepo.save(book1);
        publisherRepo.save(publisher);

        Author jerome = new Author("Jerome","J");
        Book book2 = new Book("Three men in a boat","234243");
        jerome.getBooks().add(book2);
        book2.getAuthors().add(jerome);
        publisher.getBooks().add(book2);


        authorrepo.save(jerome);
        bookRepo.save(book2);
        publisherRepo.save(publisher);

        System.out.println("Started Bootstrap");
        System.out.println("Publisher count:"+publisherRepo.count());
        System.out.println("Number of books: "+ bookRepo.count());



    }
}
