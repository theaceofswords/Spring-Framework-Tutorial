package tutorial.spring.webappdemo1.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tutorial.spring.webappdemo1.repository.authorRepo;

@Controller
public class AuthorController {
    private authorRepo authorrepo;

    public AuthorController(authorRepo authorrepo) {
        this.authorrepo = authorrepo;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors",authorrepo.findAll());
        return "authors/list";
    }
}
