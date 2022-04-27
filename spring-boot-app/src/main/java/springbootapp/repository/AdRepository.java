package springbootapp.repository;

import org.springframework.data.repository.CrudRepository;
import springbootapp.model.Ad;

import java.time.LocalDateTime;

public interface AdRepository extends CrudRepository <Ad,Long> {

    public void save(String name, String text, Long picId, LocalDateTime localDateTime, String contacts);
}
