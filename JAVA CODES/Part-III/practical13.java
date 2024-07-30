import java.util.Scanner;

class Employee {
    String firstname;
    String lastname;
    double salary;

    Employee(String f, String l, double s) {
        firstname = f;
        lastname = l;
        salary = s;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    void display() {
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(salary);
    }

    void displaySalary() {
        System.out.println("Employee yearly salary is: " + salary);
    }

    void displayGrossSalary() {
        System.out.println("Employee hike salary is: " + (salary + salary * 0.01));
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("aditya", "avlani", 500);
        Employee e2 = new Employee("aditya", "avlani", 500);
        Scanner sc = new Scanner(System.in);

        // Employee 1
        System.out.println("Enter the first name for Employee 1:");
        String f1 = sc.nextLine();
        e1.setFirstname(f1);
        System.out.println("Enter the last name for Employee 1:");
        String l1 = sc.nextLine();
        e1.setLastname(l1);
        System.out.println("Enter the salary for Employee 1:");
        double s1 = sc.nextDouble();
        e1.setSalary(s1);

        sc.nextLine();  // Consume the leftover newline character

        // Employee 2
        System.out.println("Enter the first name for Employee 2:");
        String f2 = sc.nextLine();
        e2.setFirstname(f2);
        System.out.println("Enter the last name for Employee 2:");
        String l2 = sc.nextLine();
        e2.setLastname(l2);
        System.out.println("Enter the salary for Employee 2:");
        double s2 = sc.nextDouble();
        e2.setSalary(s2);

        // Display Employee details and salaries
        System.out.println("Details of Employee 1:");
        
        e1.displaySalary();
        e1.displayGrossSalary();

        System.out.println("Details of Employee 2:");
        
        e2.displaySalary();
        e2.displayGrossSalary();

        sc.close();
    }
}
