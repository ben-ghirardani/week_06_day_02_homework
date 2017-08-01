import java.util.*;

class Photographer {

  private String name;
  private ArrayList<Camera> cameras;

  public Photographer(String name) {
      this.name = name;
      this.cameras = new ArrayList<Camera>();
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

}