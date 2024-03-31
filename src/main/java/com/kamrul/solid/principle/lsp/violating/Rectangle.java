package com.kamrul.solid.principle.lsp.violating;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangle {

  private int width;
  private int height;

  public final int getArea() {
    return width * height;
  }
}