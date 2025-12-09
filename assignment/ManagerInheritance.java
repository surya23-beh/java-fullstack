package assignment;
import java.util.Scanner;
class Person {
 String name;
 int age;
 }
class Employee extends Person {
 int empId;
 double salary;
 }
class Manager extends Employee {
 String department;
 void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Employee ID: " + empId);
     System.out.println("Salary: " + salary);
     System.out.println("Department: " + department);}
}
public class ManagerInheritance {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Manager m = new Manager();
     System.out.print("Enter Name: ");
     m.name = sc.nextLine();
     System.out.print("Enter Age: ");
     m.age = sc.nextInt();
     System.out.print("Enter Employee ID: ");
     m.empId = sc.nextInt();
     System.out.print("Enter Salary: ");
     m.salary = sc.nextDouble();
     System.out.print("Enter Department: ");
     m.department = sc.nextLine();
     m.displayDetails();
 }
}

