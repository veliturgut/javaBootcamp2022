package com.example.Kodlama.io.Devs.business.abstracts;

import com.example.Kodlama.io.Devs.business.requests.technology.CreateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.requests.technology.DeleteTechnologyRequest;
import com.example.Kodlama.io.Devs.business.requests.technology.UpdateTechnologyRequest;
import com.example.Kodlama.io.Devs.business.response.language.GetAllLanguageResponse;
import com.example.Kodlama.io.Devs.business.response.technology.GetAllTechnologyResponse;
import com.example.Kodlama.io.Devs.business.response.technology.GetByIdTechnologyResponse;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface TechnologyService {


    List<GetAllTechnologyResponse> getAll();
    GetByIdTechnologyResponse getById(int id);
    void add(CreateTechnologyRequest createTechnologyRequest);
    void delete(DeleteTechnologyRequest deleteTechnologyRequest);
    void update(UpdateTechnologyRequest updateTechnologyRequest);


}
