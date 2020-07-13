package pl.bogus.mysite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.bogus.mysite.data.ContentRepository;
import pl.bogus.mysite.model.Information;

import java.util.Comparator;
import java.util.NoSuchElementException;

@org.springframework.stereotype.Controller
@RequestMapping
public class IntroductionController {

    ContentRepository contentRepository;

    @Autowired
    public IntroductionController(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    /* @GetMapping("/hello")
     public String hello(){
         return "index";
     }*/
    @GetMapping("/hello")
    public String test(@RequestParam(value = "param1", required = false) String param, Model model) {
        Information information = contentRepository
                .findAll()
                .stream()
                .filter(a -> a.getTitle().equals(param))
                .max(Comparator.comparingLong(i -> i.getCreated().getTime()))
                .orElseThrow(NoSuchElementException::new);
        model.addAttribute("test", information.getContent());

        return "index";
    }
}
