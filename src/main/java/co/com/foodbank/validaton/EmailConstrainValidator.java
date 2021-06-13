package co.com.foodbank.validaton;

import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.validaton 18/05/2021
 */
public class EmailConstrainValidator
        implements ConstraintValidator<ValidateEmail, String> {

    private String regexp = ".+@.+\\..+";

    @Override
    public void initialize(ValidateEmail email) {

    }


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Pattern.compile(regexp).matcher(value).matches();

    }

}
