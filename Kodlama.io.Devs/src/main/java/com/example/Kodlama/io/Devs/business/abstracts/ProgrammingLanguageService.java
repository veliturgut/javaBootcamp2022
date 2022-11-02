package com.example.Kodlama.io.Devs.business.abstracts;

import com.example.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {

    void create(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);

}
