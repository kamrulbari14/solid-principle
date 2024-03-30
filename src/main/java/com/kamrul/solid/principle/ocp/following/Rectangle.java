package com.kamrul.solid.principle.ocp.following;

public class Rectangle extends OcpShape {

  @Override
  void draw() {
    System.out.println("***********");
    System.out.println("*         *");
    System.out.println("*         *");
    System.out.println("***********");
  }
}
