import java.util.Scanner;
class persons{
String name;
String gender;
String address;
int age;

persons(String name,String gender,String address,int age){
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}
class Employee extends persons {
int empid;
String company;
String qualification;
int salary;

Employee(String name,String gender,String address,int age,int empid,String company,String qualification,int salary){
super(name,gender,address,age);
{
this.empid=empid;
this.company=company;
this.qualification=qualification;
this.salary=salary;
}
}

class Teacher extends Employee{
String subject;
String department;
int teacherid;

Teacher(String name,String gender,String address,int age,int empid,String company,String qualification,int salary,String subject,String department,int teacherid){
super(name,gender,address,age,empid,company,qualification,salary);
{
this.subject=sub;
this.department=dept;
this.teacherid=tid;
}
}
void display(){
        System.out.println("Teacher Details");
        System.out.println("Teacher ID: " + tid);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Subject Taught: " + sub);
        System.out.println("Salary: " + salary);
        System.out.println("Gender" + gender);
        System.out.println("Address"+address);
        System.out.println("Age"+age);
        System.out.println("Qualification"+qualification);
        System.out.println("Company Name"+company);
        System.out.println("Employee id"+empid);
        System.out.println();
        }
        }
public class person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Teacher " + (i + 1));

            System.out.print("Teacher ID: ");
            int tid = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.println("Age");
            int age=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Gender");
            String gender =sc.nextLine();
            System.out.println("Address");
            String address=sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.println("Qualification");
            String qualification=sc.nextLine();
             
            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject Taught: ");
            String sub = sc.nextLine();
            System.out.print("Employeeid");
            int empid=sc.nextInt();
            sc.nextLine();
            
            t[i] = new Teacher(tid, name, salary, dept, subject,qualification,department,empid,sub,gender,address,age,company,empid);
        }

        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}






































