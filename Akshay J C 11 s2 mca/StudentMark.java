import java.util.Scanner;
class StudentMark{
  public static void main(String[]args)
 { 
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter number of subject");
 int n=sc.nextInt();
 int Marks[]=new int[n];
 int total=0;
 for(int i=0;i<n;i++){
  System.out.print("Enter the mark"+(i+1)+":");
  Marks[i]=sc.nextInt();
  total=total+Marks[i];
  }
  System.out.print("Enter maximum marks:");
  int max=sc.nextInt();
  double percentage=(double) total/(max*n)*100;
  System.out.println("Total marks="+total);
  System.out.println("percentage=" + percentage +"%");
  }
 }
 
