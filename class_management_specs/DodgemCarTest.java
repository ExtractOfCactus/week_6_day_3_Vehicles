import static org.junit.Assert.*;
import org.junit.*;
import class_management.*;

public class DodgemCarTest {
  DodgemCar car1;
  DodgemCar car2;

  @Before
  public void before() {
    car1 = new DodgemCar(10, 2);
    car2 = new DodgemCar(8, 3);
  }

  @Test
  public void carHasSpeed() {
    assertEquals(8, car2.getSpeed());
  }

  @Test
  public void carHasSeats() {
    assertEquals(2, car1.getSeats());
  }

  @Test
  public void carDriveDistanceTime() {
    assertEquals(2, car1.driveDistance(20));
  }
}