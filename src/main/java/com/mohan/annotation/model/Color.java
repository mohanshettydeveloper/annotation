package com.mohan.annotation.model;

import com.mohan.annotation.annotations.ColorValidation;
import lombok.Data;

@Data
@ColorValidation
public class Color {
  private String colorName;
  private String code;
  private String brand;
}
