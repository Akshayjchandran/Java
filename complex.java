import java.util.Scanner;
class complex
{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
int r1,i1,r2,i2;
int r,i;
System.out.print("Enter real part of 1st complex number:");
r1=sc.nextInt();
System.out.print("Enter imaginary part of 1st complex number:");
i1=sc.nextInt();

System.out.print("Enter real part of 2nd complex number:");
r2=sc.nextInt();
System.out.print("Enter imaginary part of 1st complex number:");
i2=sc.nextInt();
r=r1+r2;
i=i1+i2;
System.out.println("sum="+r+"+"+i+"i");
}
}
