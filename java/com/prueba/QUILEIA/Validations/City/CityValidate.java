package com.prueba.QUILEIA.Validations.City;

import com.prueba.QUILEIA.Models.City.Destino;
import com.prueba.QUILEIA.Utils.Exceptions.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface CityValidate {

    public void ValidationCity(Destino destino)throws ResourceNotFound;
}
