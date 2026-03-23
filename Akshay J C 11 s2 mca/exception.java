import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
  do {
        System.out.println("\n--- Exception Handling Demo ---");
        System.out.println("1. Arithmetic Exception");
        System.out.println("2. Array Index Out Of Bounds Exception");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
         choice = sc.nextInt();

switch (choice) {

    case 1:
      try {
         System.out.print("Enter two numbers: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int result = a / b;  
         System.out.println("Result: " + result);
         } catch (ArithmeticException e) {
         System.out.println("Error: Cannot divide by zero!");
     }
         break;
    case 2:
      try {
          int arr[] = {10, 20, 30, 40, 50};
          System.out.print("Enter index (0-4): ");
           int index = sc.nextInt();
           System.out.println("Element: " + arr[index]);
           } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Error: Invalid index! Array size is 5.");
  }
          break;

    case 3:
           System.out.println("Exiting program...");
           break;
    default:
           System.out.println("Invalid choice!");
            }
     } while (choice != 3);

        sc.close();
    }
}
