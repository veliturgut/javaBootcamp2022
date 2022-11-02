package com.example.Kodlama.io.Devs.webApi.controllers;

import com.example.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import com.example.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {

    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {

        programmingLanguageService.create(programmingLanguage);
    }

    @PutMapping("/update")
    public void update(ProgrammingLanguage programmingLanguage) throws Exception {

        programmingLanguageService.update(programmingLanguage);
    }

    @GetMapping("/delete")
    public void delete(@RequestParam int id) {

        programmingLanguageService.delete(id);
    }

    @GetMapping("/getbyid")
    public ProgrammingLanguage getById(@RequestParam int id) {

        return programmingLanguageService.getById(id);
    }


    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }




}
