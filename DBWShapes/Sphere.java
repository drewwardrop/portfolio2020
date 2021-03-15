class Sphere {

  float radius;
  float pie = (float) 3.14285714286;

  public Sphere(float r) {
   radius = r;
  }

  public float calculateVolume() {
    return (4/3) * pie * (radius * radius * radius);
  }

  public float calculateSurfaceArea() {
    return 4 * pie * (radius * radius);
  }
}