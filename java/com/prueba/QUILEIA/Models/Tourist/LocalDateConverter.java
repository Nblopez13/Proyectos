package com.prueba.QUILEIA.Models.Tourist;

import javax.persistence.AttributeConverter;
import javax.persistence.Column;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate,java.sql.Date> {
    @Override
    public Date convertToDatabaseColumn(LocalDate date) {
        return date== null ? null : Date.valueOf(date);
    }

    @Override
    public LocalDate convertToEntityAttribute(Date date) {
        return date== null ? null : new Date(date.getTime()).toLocalDate() ;
    }
}
