package com.seograder.utility;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;

/**
 * Convert from sqlDate to LocalDate.  This will be used by Hibernate.
 * Classed based on http://www.thoughts-on-java.org/persist-localdate???
 * written based on what I saw in the week 4 demo video by Paula Waite
 *
 * @author Tony Alvarez
 */

@Converter
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate locDate) {
        return (locDate == null ? null : Date.valueOf(locDate));
    }

    @Override
    public LocalDate convertToEntityAttribute(Date sqlDate) {
        return (sqlDate == null ? null : sqlDate.toLocalDate());
    }

}
