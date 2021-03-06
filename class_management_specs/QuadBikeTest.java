import static org.junit.Assert.*;
import org.junit.*;
import class_management.*;

public class QuadBikeTest {
  QuadBike bike1;
  QuadBike bike2;

  @Before
  public void before() {
    bike1 = new QuadBike(20, 100);
    bike2 = new QuadBike(30, 150);
  }

  @Test
  public void bikeHasSpeed() {
    assertEquals(20, bike1.getSpeed());
  }

  @Test 
  public void bikeHasEngineCapacity() {
    assertEquals(150, bike2.getEngineCapacity());
  }

  @Test
  public void bikeDriveDistanceTime() {
    assertEquals(5, bike1.driveDistance(100));
  }
}