package com.example.demo.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BooleanToStringConverter implements AttributeConverter<Boolean, String> {

    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        // Convert boolean to string, e.g., "true" or "false"
        return (attribute != null && attribute) ? "true" : "false";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        // Convert string to boolean, e.g., "true" to true, "false" to false
        return "true".equalsIgnoreCase(dbData);
    }
}

