package co.com.foodbank.validaton;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.validaton 18/05/2021
 */
@Documented
@Constraint(validatedBy = VolumeConstrainValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateVolume {

    String message() default "Invalid dimension for Volume.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
