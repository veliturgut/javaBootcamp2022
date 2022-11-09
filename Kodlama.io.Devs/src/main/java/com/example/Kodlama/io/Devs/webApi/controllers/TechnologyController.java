package com.example.Kodlama.io.Devs.webApi.controllers;

import com.example.Kodlama.io.Devs.business.abstracts.TechnologyService;
import com.example.Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import com.example.Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.response.technology.GetAllTechnologyResponse;
import com.example.Kodlama.io.Devs.business.response.technology.GetByIdTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {


    private TechnologyService technologyService;

    @Autowired
    public TechnologyController(TechnologyService technologyService){
        this.technologyService = technologyService;
    }

    @GetMapping("/getall")
    public List<GetAllTechnologyResponse> getAll(){



        return this.technologyService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public GetByIdTechnologyResponse getById(@RequestParam int id) {
        return this.technologyService.getById(id);
    }

    @PostMapping("/add")
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        this.technologyService.add(createTechnologyRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
        this.technologyService.delete(deleteTechnologyRequest);
    }

    @PutMapping("/update")
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {
        this.technologyService.update(updateTechnologyRequest);
    }

}
