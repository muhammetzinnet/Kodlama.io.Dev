package kodlama.io.kodlama.io.Dev.webApi;

import kodlama.io.kodlama.io.Dev.bussines.abstracts.SoftwareLanguageService;
import kodlama.io.kodlama.io.Dev.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/softwareLanguage")
public class SoftwareLanguagesController {
    private SoftwareLanguageService softwareLanguageService;

    @Autowired
    public SoftwareLanguagesController(SoftwareLanguageService softwareLanguageService) {
        this.softwareLanguageService = softwareLanguageService;
    }

    @GetMapping("/getall")
    public List<SoftwareLanguage> getAll(){
        return softwareLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(SoftwareLanguage softwareLanguage) throws Exception{
        softwareLanguageService.add(softwareLanguage);
    }

    @PostMapping("/update")
    public void update(SoftwareLanguage softwareLanguage){
        softwareLanguageService.update(softwareLanguage);
    }

    @PostMapping("/delete")
    public void delete(int id){
        softwareLanguageService.delete(id);
    }

    @GetMapping("/getById")
    public SoftwareLanguage getById(int id){
        return softwareLanguageService.getById(id);
    }
}
