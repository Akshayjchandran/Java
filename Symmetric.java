import java.util.Scanner;
public class Symmetric{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows: ");
    int r = sc.nextInt();
    System.out.print("Enter cols:");
    int c = sc.nextInt();

    int[][] a = new int[r][c];
    System.out.println("Enter the elements of the matrix:");
      for (int i = 0; i < r; i++) {
         for (int j = 0; j < c; j++) {
            a[i][j] = sc.nextInt();
          }
      }

  boolean isSymmetric = true;

   for (int i = 0; i < r; i++) {
     for (int j = 0; j < c; j++) {
       if (a[i][j] != a[j][i]) {
          isSymmetric = false;
            break;
        }
        }
     if (!isSymmetric)
       break;
      }

     if (isSymmetric)
        System.out.println("The matrix is symmetric.");
     else
        System.out.println("The matrix is not symmetric.");

       sc.close();
    }
}
