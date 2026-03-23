import java.util.Scanner;
class product
{
int pcode;
String pname;
double price;
product(int pcode,String pname,double price)
{
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the details of product 1:");
int c1=sc.nextInt();
String a1=sc.next();
double n1=sc.nextDouble();

System.out.println("Enter the details of product 2:");
int c2=sc.nextInt();
String a2=sc.next();
double n2=sc.nextDouble();

System.out.println("Enter the details of product 3:");
int c3=sc.nextInt();
String a3=sc.next();
double n3=sc.nextDouble();


product p1=new product(c1,a1,n1);
product p2=new product(c2,a2,n2);
product p3=new product(c3,a3,n3);

product low=p1;
if(p2.price<low.price)
  low=p2;
if(p3.price<low.price)
  low=p3;
  
System.out.println("Product with lowest price :");
System.out.println("code:"+low.pcode);
System.out.println("Name:"+low.pname);
System.out.println("Price:"+low.price);
}
}







