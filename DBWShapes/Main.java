import java.util.Scanner;

// Entry point for the project
class Main {
  public static void main(String[] args) {

    System.out.println("Welcome to shape maker! Lets find and volume and surface area for a few shapes...");

    String option = "";
    while(!option.equals("4")) {
      
      System.out.println();
      System.out.println("Please choose one of the following options:");
      System.out.println("1) Create a box");
      System.out.println("2) Create a sphere");      
      System.out.println("3) Create a payramid");
      System.out.println("4) Quit shape maker");

      Scanner scanner = new Scanner(System.in);
      option = scanner.nextLine();

      if(option.equals("1")) {

        System.out.println("Great! Let's make a box. Please enter the width of a box:");
        float width = Float.parseFloat(scanner.nextLine());
        System.out.println("Please enter the height of a box:");
        float height = Float.parseFloat(scanner.nextLine());
        System.out.println("Please enter the length of a box:");
        float length = Float.parseFloat(scanner.nextLine());
        Box myBox = new Box(width, height, length);
        System.out.println("The volume for your box: "+myBox.calculateVolume());
        System.out.println("The surface area for your box: "+myBox.calculateSurfaceArea());

      } else if(option.equals("2")) {

        System.out.println("Great! Let's make a sphere. Please enter the radius of a sphere:");
        float radius = Float.parseFloat(scanner.nextLine());
        Sphere mySphere = new Sphere(radius);
        System.out.println("The volume for your sphere: "+mySphere.calculateVolume());
        System.out.println("The surface area for your sphere: "+mySphere.calculateSurfaceArea());

      } else if(option.equals("3")) {

        System.out.println("Great! Let's make a pyramid. Please enter the width of a pyramid:");
        float width = Float.parseFloat(scanner.nextLine());
        System.out.println("Please enter the height of a pyramid:");
        float height = Float.parseFloat(scanner.nextLine());
        System.out.println("Please enter the length of a pyramid:");
        float length = Float.parseFloat(scanner.nextLine());
        Pyramid myPyramid = new Pyramid(width, height, length);
        System.out.println("The volume for your pyramid: "+myPyramid.calculateVolume());
        System.out.println("The surface area for your pyramid: "+myPyramid.calculateSurfaceArea());

      } else {
        if(!option.equals("4")) {
          System.out.println("I'm sorry, "+option+" is not a valid option!");
        }

      }

    }

    System.out.println("Thanks for playing!");

  }
}