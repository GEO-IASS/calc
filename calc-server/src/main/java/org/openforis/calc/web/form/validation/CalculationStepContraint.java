package org.openforis.calc.web.form.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 
 * @author S. Ricci
 * 
 */
@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CalculationStepValidator.class)
@Documented
public @interface CalculationStepContraint {

	String message() default "{CalculationStepContraint}";
	
	Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
