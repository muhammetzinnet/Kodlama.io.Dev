package kodlama.io.kodlama.io.Dev.bussines.concretes;

import kodlama.io.kodlama.io.Dev.bussines.abstracts.SoftwareLanguageService;
import kodlama.io.kodlama.io.Dev.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.kodlama.io.Dev.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
    private SoftwareLanguageRepository softwareLanguageRepository;

    @Autowired
    public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository) {
        this.softwareLanguageRepository = softwareLanguageRepository;
    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguageRepository.getAll();
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage) throws Exception {
        if (softwareLanguage.getName().equals(null) || softwareLanguage.getName() == ""){
            throw new Exception("Program dilini lütfen giriniz...");
        }
        softwareLanguageRepository.add(softwareLanguage);
    }

    @Override
    public void update(SoftwareLanguage softwareLanguage) {
        softwareLanguageRepository.update(softwareLanguage);
    }

    @Override
    public void delete(int id) {
        softwareLanguageRepository.delete(id);
    }

    @Override
    public SoftwareLanguage getById(int id) {
        return softwareLanguageRepository.getById(id);
    }
}
