package com.prueba.QUILEIA.Validations.Tourist;

import com.prueba.QUILEIA.Models.Tourist.Turista;
import com.prueba.QUILEIA.Utils.Exceptions.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface TuristaValidate {

    public void ValidationTurista(Turista turista)throws ResourceNotFound;
}
