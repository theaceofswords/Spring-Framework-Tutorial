package tutorial.spring.webappdemo1.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tutorial.spring.webappdemo1.repository.BookRepo;

@Controller
public class BooksController {

    private final BookRepo bookRepo;
    public BooksController(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

@RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookRepo.findAll());
    return "books/list";
}
}
