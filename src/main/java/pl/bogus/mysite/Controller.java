package pl.bogus.mysite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {




    @GetMapping("/test")
    public String hello(){
        return "index";
    }
}
