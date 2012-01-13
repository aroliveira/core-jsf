package aroliveira.core.beans.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyValidationValidator implements ConstraintValidator<MyValidation, String>{

	public void initialize(MyValidation arg0) {
		System.out.println("MyValidationValidator.initialize()");
	}

	public boolean isValid(String value, ConstraintValidatorContext ctx) {

		System.out.print("recebi: " + value);
		System.out.println(" resultado: " + (value.equalsIgnoreCase("12345")));
				
		return value.equalsIgnoreCase("12345");
	}
}
