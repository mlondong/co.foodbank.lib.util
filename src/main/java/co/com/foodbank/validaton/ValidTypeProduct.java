package co.com.foodbank.validaton;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.validaton 23/06/2021
 */
@Documented
@NotBlank
@NotNull
@Constraint(validatedBy = ProdutConstrainValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidTypeProduct {

    String message() default "Invalid Type Product";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
