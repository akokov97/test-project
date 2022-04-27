package springbootapp.repository;

import org.springframework.data.repository.CrudRepository;
import springbootapp.model.Role;
import springbootapp.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends CrudRepository <User, Long> {

    <S extends User> S save(Long id);

    @Transactional
    void delete(Long id);

    User getUser(Long id);

    List<User> getAllUsers();

    User getUserByEmail(String email);

    Role getRoleByName(String name);
}
