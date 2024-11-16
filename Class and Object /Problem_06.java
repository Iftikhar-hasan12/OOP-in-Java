/* Write a Java program to create a class called "Employee" with a name, job title,
and salary attributes, and methods to calculate and update salary.*/

package com.mycompany.mid;

import java.util.Scanner;

class Employee {

    String name, title;
    double salary;

    Employee(String name, String title, double salary) {
        this.name = name;

        this.salary = salary;
        this.title = title;

    }

    void udpate(double salary) {
        this.salary = salary;
    }

    void tv() {
        System.out.print("Name : " + name + "  Salary : " + salary + "  Title : " + title);
    }

}

public class Mid {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Employee Size : ");
        int n = scan.nextInt();





        Employee[] em = new Employee[n];

        for (int i = 0; i < n; i++) {
            scan.nextLine();
            System.out.print("Name : ");
            String name = scan.nextLine();
            System.out.print("Title : ");
            String title = scan.nextLine();
            System.out.print("Salary : ");
            double salary = scan.nextDouble();
            em[i] = new Employee(name, title, salary);

        }

        System.out.print("Inserted information .....\n");
        for (int i = 0; i < n; i++) {
            em[i].tv();
            System.out.print("\n");
        }
        System.out.print("\n\nUpdate salary for info : \n");
        scan.nextLine();
        String up_name;
        System.out.print("Name : ");
        up_name = scan.nextLine();
        int flag = 1;
        for (int i = 0; i < n; i++) {
            if (up_name.equals(em[i].name)) {
                System.out.print("Salary : ");
                em[i].salary = scan.nextDouble();
                flag = 0;

            }

        }

        if (flag == 1) {
            System.out.print("\nInvalid name \n");
        }

        for (int i = 0; i < n; i++) {
            em[i].tv();
            System.out.print("\n");
        }

    }
}
