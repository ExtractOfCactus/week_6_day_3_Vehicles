package class_management;
import behaviours.*;

public class QuadBike extends Vehicle implements Driveable{
  int speed;
  int engineCapacity;

  public QuadBike(int speed, int engineCapacity) {
    super(speed);
    this.engineCapacity = engineCapacity;
  }

  // public int getSpeed() {
  //   return this.speed;
  // }

  public int getEngineCapacity() {
    return this.engineCapacity;
  }

  // public int driveDistance(int distance) {
  //   return(distance / this.speed);
  // }
}