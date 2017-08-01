import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {


  Photographer photographer;
  Camera camera;

  @Before
  public void before() {
    photographer = new Photographer("Clare");
    camera = new Camera("Nikon 123", "black", "hi")
  }

  @Test
  public void hasName() {
    assertEquals("Clare", photographer.getName());
  }

}