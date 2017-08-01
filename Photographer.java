import java.util.*;

class Photographer {

  private String name;
  private ArrayList<Camera> cameras;
  private ArrayList<DigitalCamera> digitalcameras;

  public Photographer(String name) {
      this.name = name;
      this.cameras = new ArrayList<Camera>();
      this.digitalcameras = new ArrayList<DigitalCamera>();
  }


  public String getName() {
    return this.name;
  }


  public int cameraCount() {
    return this.cameras.size();
  }

  public void addCamera(Camera camera) {
    this.cameras.add(camera);
  }

  public void removeCamera(Camera camera) {
    this.cameras.remove(camera);
  }

  public int digitalCameraCount() {
    return this.digitalcameras.size();
  }

  public void addDigitalCamera(DigitalCamera digitalcamera) {
    this.digitalcameras.add(digitalcamera);
  }

  public void removeDigitalCamera(DigitalCamera digitalcamera) {
    this.digitalcameras.remove(digitalcamera);
  }

}