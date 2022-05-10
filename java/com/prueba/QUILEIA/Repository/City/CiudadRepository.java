package com.prueba.QUILEIA.Repository.City;

import com.prueba.QUILEIA.Models.City.Destino;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public interface CiudadRepository extends CrudRepository<Destino,Integer> {

    Collection<Destino>findAll();
}
