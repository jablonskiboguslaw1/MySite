package pl.bogus.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.bogus.mysite.model.Information;
import pl.bogus.mysite.service.ContentService;

@Controller
@RequestMapping("/")
public class IntroductionController {


    private final ContentService contentService;

    public IntroductionController( ContentService contentService) {

        this.contentService = contentService;
    }

    @GetMapping("/hello")
    public String paramsTest(@RequestParam(value = "param1", required = false) String param, Model model) {
        Information information = contentService.getInformation(param);
        model.addAttribute("content", information.getContent());

        return "index";
    }



    @GetMapping("")
    public String chooseContent( Model model) {

        String homeInfo = contentService.getHomeInfo();

        model.addAttribute("content", homeInfo);

        return "index";
    }
}
