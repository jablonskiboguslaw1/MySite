package pl.bogus.mysite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.bogus.mysite.data.ContentRepository;
import pl.bogus.mysite.model.Information;

import java.util.Date;

@SpringBootApplication
public class MysiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysiteApplication.class, args);
    }
    @Bean
    public CommandLineRunner dataLoader(ContentRepository repo) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                repo.save(new Information("test", "testing text", new Date()));
                repo.save(new Information("test2", "testing text2", new Date()));
                repo.save(new Information("test3", "testing text3", new Date()));
                repo.save(new Information("test4", "testing text4", new Date()));

            }
        };
    }

}
