package class_management;
import behaviours.*;

public class QuadBike implements Driveable{
  int speed;
  int engineCapacity;

  public QuadBike(int speed, int engineCapacity) {
    this.speed = speed;
    this.engineCapacity = engineCapacity;
  }

  public int getSpeed() {
    return this.speed;
  }

  public int driveDistance(int distance) {
    return(distance / this.speed);
  }
}