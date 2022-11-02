package com.example.Kodlama.io.Devs.dataAccess.abstracts;

import com.example.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {

    void create(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);

}
