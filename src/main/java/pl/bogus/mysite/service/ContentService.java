package pl.bogus.mysite.service;

import org.springframework.stereotype.Service;
import pl.bogus.mysite.data.ContentRepository;
import pl.bogus.mysite.model.Information;

import java.util.Comparator;
import java.util.NoSuchElementException;
@Service
public class ContentService {
private final ContentRepository contentRepository;

    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public Information getInformation( String param) {
        return contentRepository
                .findAll()
                .stream()
                .filter(a -> a.getTitle().equals(param))
                .max(Comparator.comparingLong(i -> i.getCreated().getTime()))
                .orElseThrow(NoSuchElementException::new);
    }

    public String getHomeInfo() {

     return    contentRepository.findByTitle("home").getContent();
    }
}
