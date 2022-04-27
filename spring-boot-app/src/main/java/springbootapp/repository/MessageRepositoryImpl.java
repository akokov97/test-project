package springbootapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import springbootapp.model.Message;

import javax.persistence.EntityManager;
import java.util.Optional;

public class MessageRepositoryImpl implements MessageRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    public <S extends Message> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Message> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Message> findById(Long aLong) {
        return Optional.ofNullable((Message) entityManager.createQuery("SELECT m FROM Message m WHERE m.id = :id"));
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Message> findAll() {

        return null;
    }

    @Override
    public Iterable<Message> findAllById(Iterable<Long> longs) {

        return null;
    }

    @Override
    public long count() {

        return 0;
    }

    @Override
    public void deleteById(Long id) {
        entityManager.createQuery("DELETE FROM Message m WHERE m.id = :id");
    }

    @Override
    public void delete(Message entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Message> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
