package com.prueba.QUILEIA.Services.City;

import com.prueba.QUILEIA.Models.City.Destino;
import com.prueba.QUILEIA.Repository.City.CiudadRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadService {

    @Autowired
    private CiudadRepositoryJpa repositoryJpa;


    public Destino getCityId(Integer id){
        return repositoryJpa.findById(id).get();
    }
}
