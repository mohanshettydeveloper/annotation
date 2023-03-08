package com.mohan.annotation.controller;

import com.mohan.annotation.model.Color;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {

  @GetMapping("/color")
  public Color getColorCode(@Valid @RequestBody Color color) {
    Color colorObj = new Color();
    colorObj.setColorName(color.getColorName());
    if (color.getColorName().equals("RED")) {
      colorObj.setCode("R100");
    } else if (color.getColorName().equals("GREEN")) {
      colorObj.setCode("G200");
    } else {
      colorObj.setCode("B300");
    }
    return colorObj;
  }

}
