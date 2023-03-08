package com.mohan.annotation.annotations;

import com.mohan.annotation.model.Color;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ColorValidator implements ConstraintValidator<ColorValidation, Color> {

  @Override
  public boolean isValid(Color color, ConstraintValidatorContext constraintValidatorContext) {
    List list = Arrays.asList(new String[]{"RED","GREEN","BLUE"});
    return list.contains(color.getColorName()) && color.getBrand().equals("HERTZ");
//    return list.contains(color);
  }

  @Override
  public void initialize(ColorValidation constraintAnnotation) {
    ConstraintValidator.super.initialize(constraintAnnotation);
  }
}
