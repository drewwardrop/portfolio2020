class Box {

  float width;
  float height;
  float length;

  public Box(float w, float h, float l) {
   width = w;
   height = h;
   length = l;
  }

  public float calculateVolume() {
    return (length * width * height);
  }

  public float calculateSurfaceArea() {
    return (
      (2 * length * width) +
      (2 * length * height) +
      (2 * height * width)
    );
  }
}