package br.com.darkthriftstore.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;
import java.time.LocalDate;
import java.util.Date;

public class PresentValidatorForCalendar implements ConstraintValidator<Present, LocalDate> {

    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext constraintValidatorContext) {
        Date now = new Date();
        return date.equals(LocalDate.now());
    }
}
