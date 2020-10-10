package pl.bogus.mysite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import pl.bogus.mysite.data.ContentRepository;
import pl.bogus.mysite.model.Information;

import java.util.Date;

@SpringBootApplication
public class MysiteApplication extends {

    public static void main(String[] args) {
        SpringApplication.run(MysiteApplication.class, args);
    }

   /* @Bean
    public CommandLineRunner dataLoader(ContentRepository repo) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                repo.save(new Information("home", "This website was created as a simple combination of frontend technologies that I learned in class and my attempts to combine the frontend with the backend after reading Spring in Action. At that time, I had no idea how to make this page public. It is now an MVP that may develop in the future. However, given the speed with which I learn new things, it will rather be replaced by something. If you want to know more, check what will happen after clicking on the tiles.", new Date()));
                repo.save(new Information("tools", "If you know this technologies, for sure you know that I used CSS and HTML… but what else? This site's code is placed on my GitHub account.  You will find there other samples of my work. If you look there you will find: MySQL database, Spring / SpringBoot and Hibernate elements, CSS, and HTML files,  Template engine Thymeleaf and more.", new Date()));
                repo.save(new Information("fromScratch", "From zero …. everyday small steps ... to the top. People generally underestimate what they can do in a year, two or more. Everyone wants to be a programmer after 360 hours, as the advertisement says. Bullshit! I knew about it. Over the past few months, I've spent many times as much time as the ad said. Bootcamp is just a guide. And then there's just hard work ... every day. It's simple.", new Date()));
                repo.save(new Information("about", "What about me? Why I want to be programmer? I have ever liked science.   I’ve been working on different places, \t I have learnt many things and what I’ve seen that every branch, every position needs more data and new technologies to grow. IT is an answer. Current global situation only proves this. For more... use Contact.", new Date()));
                repo.save(new Information("contact", "Email: jablonski.boguslaw@gmail.com\n" +
                        " LinkedIn: linkedin.com/in/boguslaw-jablonski\n" +
                        " GitHub: github.com/jablonskiboguslaw1", new Date()));

            }
        };
    }*/

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PetsApplication.class);
    }
}
