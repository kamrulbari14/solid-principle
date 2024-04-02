package com.kamrul.solid.principle.isp.violating;

public interface Car {
  String flySpeedCalculator();
  String runSpeedCalculator();
}


class FlyingCar implements Car{

  @Override
  public String flySpeedCalculator() {
    return "at 100 km/h";
  }

  @Override
  public String runSpeedCalculator() {
    return "at 300 km/h";
  }
}

class Lamborghini implements Car{

  @Override
  public String flySpeedCalculator() {
    return "Can not fly";
  }

  @Override
  public String runSpeedCalculator() {
    return "at 400 km/h";
  }
}