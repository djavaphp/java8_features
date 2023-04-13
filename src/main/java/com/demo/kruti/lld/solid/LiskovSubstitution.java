package com.demo.kruti.lld.solid;

/**
 * Subclass should extend the capability of parent. not narrow it.
 * Bicycle will break it. so shouldn't do it.
 */
public class LiskovSubstitution {
  public static void main(String[] ar) {
    Bike bike1 = new MotorCycle();
    Bike bike2 = new Bicycle();
    bike1.turnOnEngine();
    bike1.pickUpSpeed();
    bike2.turnOnEngine();
    bike2.pickUpSpeed();
  }

  interface Bike {
    void turnOnEngine();

    void pickUpSpeed();
  }

  static class MotorCycle implements Bike {
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
      isEngineOn = true;
      System.out.println("MotorCycle - Engine On" + isEngineOn);
    }

    @Override
    public void pickUpSpeed() {
      System.out.println("MotorCycle - Speed" + speed + 10);
    }
  }

  static class Bicycle implements Bike {
    int speed;

    @Override
    public void turnOnEngine() {
      throw new RuntimeException("Dont have engine");
    }

    @Override
    public void pickUpSpeed() {
      System.out.println("Bicycle - Speed" + speed + 10);
    }
  }
}
