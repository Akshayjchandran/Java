import java.util.Scanner;

class Shape{
void findArea(){
System.out.println("Area");
}
}

class Rectangle extends Shape{
double l,b;

Rectangle(double l,double b){
this.l=l;
this.b=b;
}

void findArea(){
double area=l*b;
System.out.println("Area of Rectangle = "+area);
}
}

class Circle extends Shape{
double r;

Circle(double r){
this.r=r;
}

void findArea(){
double area=3.14*r*r;
System.out.println("Area of Circle = "+area);
}
}

class Square extends Shape{
double s;

Square(double s){
this.s=s;
}

void findArea(){
double area=s*s;
System.out.println("Area of Square = "+area);
}
}

public class ShapeArea{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter length and breadth of rectangle");
double l=sc.nextDouble();
double b=sc.nextDouble();

System.out.println("Enter radius of circle");
double r=sc.nextDouble();

System.out.println("Enter side of square");
double s=sc.nextDouble();

Rectangle r1=new Rectangle(l,b);
Circle c1=new Circle(r);
Square s1=new Square(s);

r1.findArea();
c1.findArea();
s1.findArea();

sc.close();
}
}
