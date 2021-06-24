package co.com.foodbank.validaton;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.validaton 23/06/2021
 */
public class ProdutConstrainValidator
        implements ConstraintValidator<ValidTypeProduct, String> {


    private static final String NONPERISHABLE = "NONPERISHABLE";

    private static final String SEMIPERISHABLE = "SEMIPERISHABLE";

    private static final String PERISHABLE = "PERISHABLE";



    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && matchType(value) && (value.length() > 0);
    }



    private boolean matchType(String str) {

        Set<String> types = new HashSet<>(
                Arrays.asList(NONPERISHABLE, SEMIPERISHABLE, PERISHABLE));

        return types.stream().anyMatch(d -> str.equals(d.toString()));
    }

}
