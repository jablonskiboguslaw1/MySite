package pl.bogus.mysite.data;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bogus.mysite.model.Information;

public interface ContentRepository extends JpaRepository<Information,Long>{
}
