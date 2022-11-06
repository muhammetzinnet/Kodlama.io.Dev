package kodlama.io.kodlama.io.Dev.dataAccess.concretes;

import kodlama.io.kodlama.io.Dev.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.kodlama.io.Dev.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemorySoftwareLanguageRepository implements SoftwareLanguageRepository {
    List<SoftwareLanguage> softwareLanguages;
    @Autowired
    public InMemorySoftwareLanguageRepository() {
        softwareLanguages = new ArrayList<>();
        softwareLanguages.add(new SoftwareLanguage(1,"Java"));
        softwareLanguages.add(new SoftwareLanguage(2,"Python"));
        softwareLanguages.add(new SoftwareLanguage(3,"C#"));
        softwareLanguages.add(new SoftwareLanguage(4,"JavaScript"));
        softwareLanguages.add(new SoftwareLanguage(5,"Php"));
        softwareLanguages.add(new SoftwareLanguage(6,"Golang"));
        softwareLanguages.add(new SoftwareLanguage(7,"Kotlin"));
    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguages;
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage) {
        softwareLanguages.add(softwareLanguage);
    }

    @Override
    public void update(SoftwareLanguage softwareLanguage) {
        for (SoftwareLanguage language:softwareLanguages) {
            if (language.getId() == softwareLanguage.getId()){
                softwareLanguages.remove(softwareLanguage);
            }
        }
        softwareLanguages.add(softwareLanguage);
    }

    @Override
    public void delete(int id) {
        int languageIndex = 0;
        for (SoftwareLanguage language:softwareLanguages) {
            if (language.getId() == id){
                languageIndex = softwareLanguages.indexOf(language);
                break;
            }
        }
        softwareLanguages.remove(languageIndex);
    }

    @Override
    public SoftwareLanguage getById(int id) {
        SoftwareLanguage softwareLanguage = null;
        for (SoftwareLanguage language : softwareLanguages){
            if(language.getId() == id){
                softwareLanguage = language;
                break;
            }
        }
        return softwareLanguage;
    }
}
