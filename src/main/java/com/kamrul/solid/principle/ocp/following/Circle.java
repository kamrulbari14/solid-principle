package com.kamrul.solid.principle.ocp.following;

public class Circle extends OcpShape{

  @Override
  void draw() {
    System.out.println("       ****  ");
    System.out.println("   *           * ");
    System.out.println("  *             * ");
    System.out.println(" *               * ");
    System.out.println("  *             *  ");
    System.out.println("   *           *  ");
    System.out.println("       ****  ");
  }

}
