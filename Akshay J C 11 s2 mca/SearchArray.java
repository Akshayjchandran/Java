import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

   int n, search;
   int position = -1;
      System.out.println("Enter the number of elements:");
      n = sc.nextInt();
      
     int[] arr = new int[n];
     System.out.println("Enter the elements of array:");
     for (int i = 0; i < n; i++) {
       arr[i] = sc.nextInt();
        }

     System.out.println("Enter the element to search:");
     search = sc.nextInt();

      for (int i = 0; i < n; i++) {
         if (arr[i] == search) {
              position = i;  
             break;
            }
     }
        if (position != -1)
            System.out.println("Element found at position: " + (position + 1));
        else
            System.out.println("Element not found in the array.");

        sc.close();
    }
}
