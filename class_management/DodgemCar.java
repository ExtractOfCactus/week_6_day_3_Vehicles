package class_management;
import behaviours.*;

public class DodgemCar implements Driveable{
  int speed;
  int numberOfSeats;

  public DodgemCar(int speed, int numberOfSeats) {
    this.speed = speed;
    this.numberOfSeats = numberOfSeats;
  }

  public int getSpeed() {
    return this.speed;
  }

  public int getSeats() {
    return this.numberOfSeats;
  }

  public int driveDistance(int distance) {
    return(distance / this.speed);
  }
}