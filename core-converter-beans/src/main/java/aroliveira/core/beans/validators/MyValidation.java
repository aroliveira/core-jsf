package aroliveira.core.beans.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy=MyValidationValidator.class)
public @interface MyValidation {
	
	String message() default "{javax.validation.constraints.Min.message}";
	Class[] groups() default {};
	Class<? extends Payload> []payload() default {};
	
}
