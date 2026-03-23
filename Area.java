import java.util.Scanner;

class Shape {

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(double radius) {
        return 3.14159 * radius * radius;
    }

    double area(int side) {
        return side * side;
    }
}

public class Area {

   public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  Shape obj = new Shape();
  System.out.print("Enter length: ");
    double l = sc.nextDouble();
   System.out.print("Enter breadth: ");
    double b = sc.nextDouble();
   System.out.println("Area of Rectangle = " + obj.area(l, b));
    System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        
        System.out.println("Area of Circle = " + obj.area(r));

        System.out.print("Enter side: ");
        int s = sc.nextInt();

        System.out.println("Area of Square = " + obj.area(s));

        sc.close();
    }
}
