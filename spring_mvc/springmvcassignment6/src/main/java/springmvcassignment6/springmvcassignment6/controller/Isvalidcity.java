package springmvcassignment6.springmvcassignment6.controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=cityvalidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface Isvalidcity {
String message() default "please enter valid phone number";
Class<?>[] groups() default{};
Class<? extends Payload>[] payload() default{};
}
