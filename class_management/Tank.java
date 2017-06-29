package class_management;
import behaviours.*;

public class Tank extends Vehicle implements Driveable {
  int speed;
  String type;

  public Tank(int speed, String type) {
    super(speed);
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
}