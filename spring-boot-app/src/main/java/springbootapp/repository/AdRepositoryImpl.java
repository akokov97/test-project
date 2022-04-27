package springbootapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import springbootapp.model.Ad;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.Optional;

public class AdRepositoryImpl implements AdRepository{

    @Autowired
    EntityManager entityManager;

    @Override
    public Iterable saveAll(Iterable entities) {
        return null;
    }


    @Override
    public <S extends Ad> S save(S entity) {
        return null;
    }

    @Override
    public Optional<Ad> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAllById(Iterable iterable) {
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
    public void delete(Ad entity) {

    }

    @Override
    public void deleteAllById(Iterable iterable) {

    }

    @Override
    public void deleteAll(Iterable entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void save(String name, String text, Long picId, LocalDateTime localDateTime, String contacts) {
        Ad ad = new Ad(name, text, picId, localDateTime, contacts);
        entityManager.persist(ad);
    }
}
