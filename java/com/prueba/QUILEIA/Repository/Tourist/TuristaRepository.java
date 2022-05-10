package com.prueba.QUILEIA.Repository.Tourist;

import com.prueba.QUILEIA.Models.Tourist.Turista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface TuristaRepository extends CrudRepository<Turista,Integer> {

    Collection<Turista>findAll();
}
