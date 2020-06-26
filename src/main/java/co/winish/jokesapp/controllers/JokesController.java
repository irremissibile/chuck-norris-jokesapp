package co.winish.jokesapp.controllers;

import co.winish.jokesapp.services.JokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokesController {

    private final JokesServiceImpl jokesService;

    public JokesController(JokesServiceImpl jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"", "/"})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }
}
