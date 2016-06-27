package com.ranga.reflection.completeexample;

/**
 * Created by rgonugunta on 6/27/16.
 */
@UnderConstruction(owner = "Navin Gujarish")
public class DateValidator {

    public void validate(Object value) throws RuntimeException {
        String date = (String) value;
        String errorLabel = "Please enter a valid date.";
        if (date.isEmpty()) {
            throw new RuntimeException("");
        }
    }
}
