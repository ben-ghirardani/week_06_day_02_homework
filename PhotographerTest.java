import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {


  Photographer photographer;
  Camera camera;

  @Before
  public void before() {
    photographer = new Photographer("Clare");
    camera = new Camera();
  }

  @Test
  public void hasName() {
    assertEquals("Clare", photographer.getName());
  }

  @Test
  public void cameraCount(){
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.removeCamera(camera);
    assertEquals(0, photographer.cameraCount());
  }

}