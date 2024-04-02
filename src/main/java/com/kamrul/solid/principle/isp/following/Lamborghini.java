package com.kamrul.solid.principle.isp.following;

public class Lamborghini implements RunningBehavior{

  @Override
  public String runSpeedCalculator() {
    return "at 400 km/h";
  }
}

class FighterJet implements FlyingBehavior, RunningBehavior{

  @Override
  public String flySpeedCalculator() {
    return "at 500 km/h speed";
  }

  @Override
  public String runSpeedCalculator() {
    return "at 300 km/h speed";
  }
}