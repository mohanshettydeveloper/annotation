package com.mohan.annotation.annotations;

import static java.lang.annotation.ElementType.TYPE;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Target TYPE means can be applied at Class level, others are FIELD & PARAMETER.
//applied at field level
@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ColorValidator.class)
public @interface ColorValidation {

  String message() default "Invalid color: must be RED, GREEN or BLUE";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
