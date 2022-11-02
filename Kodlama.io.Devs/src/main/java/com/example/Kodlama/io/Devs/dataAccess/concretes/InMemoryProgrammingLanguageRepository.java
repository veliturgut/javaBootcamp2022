package com.example.Kodlama.io.Devs.dataAccess.concretes;

import com.example.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {


    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository(){

        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
        programmingLanguages.add(new ProgrammingLanguage(2,"Python"));
        programmingLanguages.add(new ProgrammingLanguage(3,"Javascript"));
        programmingLanguages.add(new ProgrammingLanguage(4,"C#"));



    }

    @Override
    public void create(ProgrammingLanguage programmingLanguage) {

        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {

        for (ProgrammingLanguage language : programmingLanguages){
            if (language.getId() == programmingLanguage.getId()){
                language.setName(programmingLanguage.getName());
            }

        }


    }

    @Override
    public void delete(int id) {

        ProgrammingLanguage language=getById(id);
        programmingLanguages.remove(language);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {


        for (ProgrammingLanguage programmingLanguage : programmingLanguages){
            if (programmingLanguage.getId() == id){
                return programmingLanguage;
            }
        }

        return null;
    }
}
