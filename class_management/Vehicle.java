package class_management;

public abstract class Vehicle {
  int speed;

  public Vehicle(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return this.speed;
  }

  public int driveDistance(int distance) {
    return(distance / this.speed);
  }
}