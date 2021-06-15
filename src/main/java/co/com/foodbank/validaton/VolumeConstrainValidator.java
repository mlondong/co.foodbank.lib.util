package co.com.foodbank.validaton;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Class to validate the parameters in Volume for all vehicules.
 * 
 * @author mauricio.londono@gmail.com co.com.foodbank.validaton 18/05/2021
 */
public class VolumeConstrainValidator
        implements ConstraintValidator<ValidateVolume, String> {

    @Override
    public void initialize(ValidateVolume volume) {

    }


    @Override
    public boolean isValid(String valueField,
            ConstraintValidatorContext context) {

          return valueField != null && valueField.matches("[0-9]+")
                && (valueField.length() > 0) && (valueField.length() <= 3);

    }



}


