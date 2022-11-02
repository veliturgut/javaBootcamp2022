package com.example.Kodlama.io.Devs.business.concretes;

import com.example.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import com.example.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void create(ProgrammingLanguage programmingLanguage) throws Exception {

        if (programmingLanguage.getName() != null){
            for (ProgrammingLanguage language : programmingLanguageRepository.getAll()){

                if (language.getName().equalsIgnoreCase(programmingLanguage.getName())){
                    throw new Exception("Aynı programlama dili zaten ekli !");
                }

            }
            programmingLanguageRepository.create(programmingLanguage);
        }
        else {
            throw new Exception("Programlama dili boş olamaz !");
        }

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {

        programmingLanguageRepository.update(programmingLanguage);
    }

    @Override
    public void delete(int id) {

        programmingLanguageRepository.delete(id);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.getById(id);
    }
}
