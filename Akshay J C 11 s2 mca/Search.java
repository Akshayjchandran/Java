import java.util.Scanner;
public class Search{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of element:");
	int n=sc.nextInt();
	int[] e=new int[n];
	System.out.println("Eneter the elements :");
	for(int i=0;i<n;i++){
	e[i]=sc.nextInt();}
	System.out.println("Enter the element to be searched:");
	String key=sc.nextLine();
	int falg=0;
	for(int i=0;i<n;i++){
	System.out.println("Element is found at "+(i+1));
	flag=1;
	break;
   }
}
if(flag == 0){
System.out.println("THE element is not found");
}
sc.close();
}
}
