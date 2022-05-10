package com.prueba.QUILEIA.Validations.City;

import com.prueba.QUILEIA.Models.City.Destino;
import com.prueba.QUILEIA.Utils.Exceptions.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
public class CiudadValidation implements CityValidate{

    private void Message(String message)throws ResourceNotFound{
        throw new ResourceNotFound(message);
    }

    @Override
    public void ValidationCity(Destino destino) throws ResourceNotFound {
        if (destino.getName()==null){
            this.Message("El Name is Obligatorio,Intente Nuevamente");
        }
        if (destino.getCantidadHabitantes()==0){
            this.Message("La Campo is Obligatorio,Intente Nuevamente");

        }
        if (destino.getSitioMasTuristico()==null){
            this.Message("El Campo is Obligatorio,Intente Nuevamente");

        }
        if (destino.getHotelMasReservado()==null){
            this.Message("El Campo is Obligatorio,Intente Nuevamente");

        }

    }
}
