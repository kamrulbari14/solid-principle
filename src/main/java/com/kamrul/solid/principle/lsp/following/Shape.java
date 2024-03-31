package com.kamrul.solid.principle.lsp.following;

import lombok.AllArgsConstructor;

public class Shape {

  public int getArea() {
    return 100;
  }

}

@AllArgsConstructor
class Square extends Shape {

  private int height;

  @Override
  public int getArea() {
    return height * height;
  }

}

@AllArgsConstructor
class Rectangle extends Shape {

  private int height;
  private int width;

  @Override
  public int getArea() {
    return height * width;
  }

}

class LspMain {

  public static void main(String[] args) {

    Shape shape = new Shape();
    Shape rectangle = new Rectangle(5,4);
    Shape square = new Square(5);

    System.out.println("Shape : " + shape.getArea());
    System.out.println("Rectangle : " + rectangle.getArea());
    System.out.println("Square : " + square.getArea());

  }

}