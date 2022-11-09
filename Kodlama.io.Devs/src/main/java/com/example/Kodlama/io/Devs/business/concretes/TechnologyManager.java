package com.example.Kodlama.io.Devs.business.concretes;

import com.example.Kodlama.io.Devs.business.abstracts.TechnologyService;
import com.example.Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import com.example.Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.response.technology.GetAllTechnologyResponse;
import com.example.Kodlama.io.Devs.business.response.technology.GetByIdTechnologyResponse;
import com.example.Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import com.example.Kodlama.io.Devs.entities.concretes.Technology;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TechnologyManager implements TechnologyService {


    private TechnologyRepository technologyRepository;

    @Autowired
    public TechnologyManager(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }
    @Override
    public List<GetAllTechnologyResponse> getAll() {

        List<Technology> technologies = this.technologyRepository.findAll();
        List<GetAllTechnologyResponse> technologiesResponse = new ArrayList<>();
        for(Technology technology : technologies) {
            GetAllTechnologyResponse responseItem = new GetAllTechnologyResponse();
            responseItem.setId(technology.getId());
            responseItem.setName(technology.getTechnologyName());

            technologiesResponse.add(responseItem);
        }
        return technologiesResponse;
    }

    @Override
    public GetByIdTechnologyResponse getById(int id) {

        Technology technology = this.technologyRepository.findById(id).get();
        GetByIdTechnologyResponse response = new GetByIdTechnologyResponse();
        response.setId(technology.getId());
        response.setName(technology.getTechnologyName());

        return response;
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {

        Technology technology = new Technology();
        technology.setTechnologyName(createTechnologyRequest.getName());
        this.technologyRepository.save(technology);
    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
        this.technologyRepository.deleteById(deleteTechnologyRequest.getId());
    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {

        Technology technology = this.technologyRepository.findById(updateTechnologyRequest.getId()).get();
        technology.setTechnologyName(updateTechnologyRequest.getName());
        this.technologyRepository.save(technology);


    }
}
