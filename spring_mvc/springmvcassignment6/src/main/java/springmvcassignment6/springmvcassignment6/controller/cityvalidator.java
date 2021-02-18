package springmvcassignment6.springmvcassignment6.controller;

import java.util.Map.Entry;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class cityvalidator implements ConstraintValidator<Isvalidcity,Integer>{

	

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		int length = String.valueOf(value).length();
		if(length<10)
			return false;
	
		else
			return true;
	}
}
