package com.prueba.QUILEIA.Repository.City;

import com.prueba.QUILEIA.Models.City.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepositoryJpa extends JpaRepository<Destino,Integer> {
}
