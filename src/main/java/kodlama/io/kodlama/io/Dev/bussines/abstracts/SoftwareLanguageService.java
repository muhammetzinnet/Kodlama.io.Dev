package kodlama.io.kodlama.io.Dev.bussines.abstracts;

import kodlama.io.kodlama.io.Dev.entities.concretes.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> getAll();
    void add(SoftwareLanguage softwareLanguage) throws Exception;
    void update(SoftwareLanguage softwareLanguage);
    void delete(int id);
    SoftwareLanguage getById(int id);
}
