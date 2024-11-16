/* Write a Java program to create a class called "Bank" with a collection of accounts 
and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain 
account details of a particular customer.*/


package com.mycompany.mid;

import java.util.ArrayList;
import java.util.Scanner;

class Bank {

    ArrayList<Accounts> a;

    Bank() {
        a = new ArrayList<>();
    }

    void add() {
        Accounts ab = new Accounts();
        ab.fun();
        a.add(ab);

    }

    void remove() {

        Scanner scan = new Scanner(System.in);

        System.out.print("ID : ");
        int id = scan.nextInt();

        for (Accounts x : a) {
            if (x.acc == id) {

                a.remove(x);

                break;
            }
        }

        System.out.print("Deleted Success");
    }

   
    void deposite() {
        Scanner scan = new Scanner(System.in);
        Accounts ab = new Accounts();
        System.out.print("ID : ");
        int id = scan.nextInt();
        System.out.print("Deposite Ammount :");
        double ammnt = scan.nextDouble();
        for (Accounts x : a) {
            if (x.acc == id) {
                x.balance += ammnt;
            }
        }
    }

    void withdraw() {
        Scanner scan = new Scanner(System.in);
        Accounts ab = new Accounts();
        System.out.print("ID : ");
        int id = scan.nextInt();
        System.out.print("Withdraw Ammount :");
        double ammnt = scan.nextDouble();
        for (Accounts x : a) {
            if (x.acc == id) {
                x.balance -= ammnt;
            }
        }

    }

    void check() {
        for (Accounts x : a) {
            x.tv();
        }
    }

}

class Accounts {

    Scanner scan = new Scanner(System.in);
    double balance;
    String name;
    int acc;

    void fun() {
        System.out.print("Name : ");
        name = scan.nextLine();
        System.out.print("Account No : ");
        acc = scan.nextInt();
        System.out.print("Ammount : ");
        balance = scan.nextDouble();

    }

    void tv() {
        System.out.println(" Name : " + name + "  Acc_No : " + acc + "   Ammount : " + balance);
    }

}

public class Mid {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Bank b = new Bank();
        while (true) {
            System.out.print("1.Create\n2.Deposite\n3.Withdraw \n4.Remove \n5.check All\n\n choose : ");
            int n = scan.nextInt();
            switch (n) {
                case 01:
                    b.add();
                    break;
                case 02:
                    b.deposite();
                    break;
                case 03:
                    b.withdraw();
                    break;
                case 4:
                    b.remove();
                    break;
                case 5:
                    b.check();
                    break;

            }

        }

    }
}
