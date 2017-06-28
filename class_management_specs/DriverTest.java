import static org.junit.Assert.*;
import org.junit.*;
import class_management.*;

public class DriverTest {
  Driver driver;

  @Before
  public void before() {
    QuadBike bike = new QuadBike(20, 100);
    driver = new Driver("Joey", bike);
  }

  @Test
  public void driverHasName() {
    assertEquals("Joey", driver.getName());
  }
}