package springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import springbootapp.model.Ad;
import springbootapp.repository.AdRepository;

import java.time.LocalDateTime;
import java.util.List;

public class AdServiceImpl implements AdService{

    @Autowired
    private AdRepository adRepository;

    @Override
    public void createAd(String name, String text, Long picId, LocalDateTime localDateTime, String contacts) {
        adRepository.save(name, text, picId, localDateTime, contacts);
    }

    @Override
    public void editAd(Long id, String name, String text, Long picId, LocalDateTime localDateTime, String contacts) {

    }

    @Override
    public void deleteAd(Long id) {

    }

    @Override
    public List<Ad> getAllAds() {
        return null;
    }

    @Override
    public Ad getAdById(Long id) {
        return null;
    }

}
