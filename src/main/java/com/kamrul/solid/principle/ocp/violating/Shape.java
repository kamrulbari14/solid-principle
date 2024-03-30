package com.kamrul.solid.principle.ocp.violating;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Shape {

  private final String type;

  public void draw() {
    if (type.equalsIgnoreCase("circle")) {
      drawCircle();
    } else if (type.equalsIgnoreCase("rectangle")) {
      drawRectangle();
    } else {
      System.out.println("Unsupported shape");
    }
  }

  private void drawCircle() {
    System.out.println("  ***  ");
    System.out.println(" *   * ");
    System.out.println("*     *");
    System.out.println("*     *");
    System.out.println("*     *");
    System.out.println(" *   * ");
    System.out.println("  ***  ");
  }

  private void drawRectangle() {
    System.out.println("******");
    System.out.println("*    *");
    System.out.println("*    *");
    System.out.println("******");
  }
}