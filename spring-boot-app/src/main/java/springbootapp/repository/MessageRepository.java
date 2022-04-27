package springbootapp.repository;

import org.springframework.data.repository.CrudRepository;
import springbootapp.model.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

}
