package com.prueba.QUILEIA.Repository.Tourist;

import com.prueba.QUILEIA.Models.Tourist.Turista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuristaRepositoryJpa extends JpaRepository<Turista,Integer> {
}
