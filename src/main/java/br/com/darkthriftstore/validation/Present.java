package br.com.darkthriftstore.validation;

import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.time.LocalDate;

@Target(ElementType.FIELD)
@Constraint(validatedBy = PresentValidatorForCalendar.class)
public @interface Present {

}
