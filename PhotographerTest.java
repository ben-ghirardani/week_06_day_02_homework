import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {


  Photographer photographer;
  Camera camera;
  DigitalCamera digitalcamera;
  AnalogCamera analogcamera;

  @Before
  public void before() {
    photographer = new Photographer("Clare");
    camera = new Camera("Nikon 123");
    digitalcamera = new DigitalCamera("Digital Camera");
    analogcamera = new AnalogCamera("Analog Camera");
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

  @Test
  public void digitalCameraCount(){
    assertEquals(0, photographer.digitalCameraCount());
  }

  @Test
  public void canAddDigitalCamera() {
    photographer.addDigitalCamera(digitalcamera);
    assertEquals(1, photographer.digitalCameraCount());
  }

  @Test
  public void canRemoveDigitalCamera() {
    photographer.removeDigitalCamera(digitalcamera);
    assertEquals(0, photographer.digitalCameraCount());
  }


}