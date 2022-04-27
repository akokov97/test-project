package springbootapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import springbootapp.model.Role;
import springbootapp.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public <S extends User> S save(Long id) {
        User user = getUser(id);
        user.setFirstName(user.getFirstName());
        user.setLastName(user.getLastName());
        user.setAge(user.getAge());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        user.setPasswordConfirm(user.getPasswordConfirm());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().clear();

        if (user.getRoles().equals("ROLE_ADMIN")) {
            user.getRoles().add(getRoleByName("ROLE_ADMIN"));
            user.getRoles().add(getRoleByName("ROLE_USER"));
        } else {
            user.getRoles().add(getRoleByName("ROLE_USER"));
        }
        return (S) entityManager.merge(user);
    }

    public User save(String firstName, String lastName, Byte age, String email, String password, String role){
        User user = new User(firstName, lastName, age, email, password);
        user.setPassword(passwordEncoder.encode(password));
        user.setRoles(new HashSet<>());

        if (role.equals("ROLE_ADMIN")) {
            user.getRoles().add(getRoleByName("ROLE_ADMIN"));
            user.getRoles().add(getRoleByName("ROLE_USER"));
        } else {
            user.getRoles().add(getRoleByName("ROLE_USER"));
        }
        entityManager.persist(user);
        return user;
    }

    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }


    @Override
    public void delete(User user) {
    }

    @Override
    @Transactional
    public void delete(Long id) {
        entityManager.createQuery("DELETE FROM User u WHERE u.id = :id");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public User getUser(Long id) {
        return (User) entityManager.createQuery("SELECT u FROM User u WHERE u.id = :id");
    }

    @Override
    public List<User> getAllUsers() {
        List<User> listUsers = (List<User>) entityManager.createQuery("SELECT u FROM User u").getResultList();
        return listUsers;
    }

    @Override
    public User getUserByEmail(String email) {
        return (User) entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email")
                .setParameter("email", email).getSingleResult();
    }

    @Override
    public Role getRoleByName(String name) {
        return (Role) entityManager.createQuery("SELECT r FROM Role r WHERE r.name = :name")
                .setParameter("name", name).getSingleResult();
    }
}
