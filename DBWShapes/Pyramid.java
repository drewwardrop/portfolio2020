class Pyramid {

  float width;
  float height;
  float length;

  public Pyramid(float w, float h, float l) {
   width = w;
   height = h;
   length = l;
  }

  public float calculateVolume() {
    return (float)(0.33333333333) * (length * width * height);
  }

  public float calculateSurfaceArea() {
    return (float)
    ((length * width) + 
    (length * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2))) + 
    (width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2))));
  }
}