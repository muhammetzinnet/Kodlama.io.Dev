package kodlama.io.kodlama.io.Dev.dataAccess.abstracts;

import kodlama.io.kodlama.io.Dev.entities.concretes.SoftwareLanguage;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SoftwareLanguageRepository {
    List<SoftwareLanguage> getAll();
    void add(SoftwareLanguage softwareLanguage);
    void update(SoftwareLanguage softwareLanguage);
    void delete(int id);
    SoftwareLanguage getById(int id);
}
