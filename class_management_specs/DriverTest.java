import static org.junit.Assert.*;
import org.junit.*;
import class_management.*;

public class DriverTest {
  Driver driver;
  QuadBike bike;

  @Before
  public void before() {
    bike = new QuadBike(20, 100);
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
}