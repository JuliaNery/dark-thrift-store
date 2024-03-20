package br.com.darkthriftstore.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;

@Target(ElementType.FIELD)
@Constraint(validatedBy = PresentValidatorForCalendar.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Present {
    String message() default "Data invalida";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
