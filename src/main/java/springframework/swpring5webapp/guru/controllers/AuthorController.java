package springframework.swpring5webapp.guru.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.swpring5webapp.guru.repositories.AuthorRepository;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());

        return "authors/list";
    }
}
