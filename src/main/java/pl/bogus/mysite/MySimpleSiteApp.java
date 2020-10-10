package pl.bogus.mysite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MySimpleSiteApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MySimpleSiteApp.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MySimpleSiteApp.class);
    }
}
