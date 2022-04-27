package springbootapp.service;

import springbootapp.model.Ad;

import java.time.LocalDateTime;
import java.util.List;

public interface AdService {

    void createAd(String name, String text, Long picId, LocalDateTime localDateTime, String contacts);

    void editAd(Long id, String name, String text, Long picId, LocalDateTime localDateTime, String contacts);

    void deleteAd(Long id);

    List<Ad> getAllAds();

    Ad getAdById(Long id);
}
