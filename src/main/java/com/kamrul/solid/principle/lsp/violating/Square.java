package com.kamrul.solid.principle.lsp.violating;

public class Square extends Rectangle {

  @Override
  public void setWidth(int width) {
    super.setWidth(width);
    super.setHeight(width);
  }

  @Override
  public void setHeight(int height) {
    super.setHeight(height);
    super.setWidth(height);
  }

}

class LspMain {
  public static void main(String[] args) {
    Rectangle square = new Square();
    square.setWidth(5);
    square.setHeight(4);

    System.out.println("Area: " + square.getArea());
  }
}