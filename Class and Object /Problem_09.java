/*The above "Student" class has three private 
attributes: 'name', 'grade', and 'courses'. 
The 'name' and 'grade' attributes are initialised 
in the constructor with the values passed as arguments. 
The 'courses' attribute is initialised as an empty array list.
There are getter methods for the 'name', 'grade', and 'courses' attributes.
There are also methods to add and remove courses from the 'courses' attribute.

*/

package com.mycompany.mid;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String name, grade, course;
    ArrayList<String> c2 = new ArrayList<>();

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;

    }

    Student(String course) {
        this.course = course;

    }

    void tv() {
        System.out.print("Name : " + name + " Grade : " + grade);
    }

    void tv2() {

        System.out.print("Name : " + name + " Grade : " + grade);
        System.out.print("\n");
        if (c2 != null) {
            for (String s : c2) {
                System.out.print("Course : " + s);
                System.out.print("\n");
            }
        }
    }

}

public class Mid {

    public static void main(String[] args) {
        String name, grade, course;
        Scanner scan = new Scanner(System.in);

        ArrayList<Student> std = new ArrayList<>();

        System.out.print("Enter Students Size  : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            scan.nextLine();
            System.out.print("Name : ");
            name = scan.nextLine();
            System.out.print("Grade : ");
            grade = scan.nextLine();
            Student s = new Student(name, grade);
            std.add(s);

        }

        for (Student x : std) {
            x.tv();
            System.out.println("");
        }

        System.out.print("Stduent name : ");
        String temp = scan.nextLine();
        int no;
        for (Student x : std) {
            if (temp.equals(x.name)) {
                System.out.print("Enter Course No : ");
                no = scan.nextInt();
                ArrayList<String> s = new ArrayList<>();
                System.out.println("Course name : \n");
                for (int i = 0; i < no; i++) {

                    System.out.print((i + 1) + ".");
                    course = scan.nextLine();

                    s.add(course);
                    scan.nextLine();
                }
                x.c2 = s;

            }
        }

        for (Student x : std) {
            x.tv2();
            System.out.println("");
        }

    }
}
