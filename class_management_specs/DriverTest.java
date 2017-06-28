import static org.junit.Assert.*;
import org.junit.*;
import class_management.*;

public class DriverTest {
  Driver driver;
  QuadBike bike;
  DodgemCar car;

  @Before
  public void before() {
    bike = new QuadBike(20, 100);
    car = new DodgemCar(10, 2);
    driver = new Driver("Joey", bike);
  }

  @Test
  public void driverHasName() {
    assertEquals("Joey", driver.getName());
  }

  @Test
  public void driverHasVehicle() {
    assertEquals(bike, driver.getVehicle());
  }

  @Test
  public void canSetVehicle() {
    driver.setVehicle(car);
    assertEquals(car, driver.getVehicle());
  }

  // @Test
  // public void driverCanDriveDistance() {
  //   assertEquals(5, driver.driveDistance(bike, 100))
  // }
}