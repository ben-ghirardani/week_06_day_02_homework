class DigitalCamera implements Printable {

  private String details;

  public DigitalCamera(String details) {
      this.details = details;
  }

  public String printDetails() {
    System.out.println(this.details);
  }

}