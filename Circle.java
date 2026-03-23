import java.util.Scanner;

interface shape {
    void area();
    void perimeter();
}

class circles implements shape {
    double r;

    circles(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }

    public void perimeter() {
        System.out.println("Circle Perimeter: " + (2 * 3.14 * r));
    }
}

class Rectangle implements shape {
    double l;
    double b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("Rectangle Area: " + (l * b));
    }

    public void perimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (l + b)));
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();

                circles c = new circles(r);
                c.area();
                c.perimeter();

            } else if (choice == 2) {
                System.out.print("Enter length and breadth: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();

                Rectangle R = new Rectangle(l, b);
                R.area();
                R.perimeter();

            } else if (choice == 3) {
                System.out.println("Exit");

            } else {
                System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
    }
}


