import static org.junit.Assert.*;
import org.junit.*;
import class_management.*;

public class TankTest {
  Tank tank1;
  Tank tank2;

  @Before
  public void before() {
    tank1 = new Tank(30, "Sherman");
    tank2 = new Tank(40, "Tiger");
  }
  
  @Test
  public void tankHasSpeed() {
    assertEquals(30, tank1.getSpeed());
  }  

  @Test
  public void tankHasType() {
    assertEquals("Tiger", tank2.getType());
  }
}