package com.sau.tech;

import java.util.Scanner;


public class Myclass03 {
    public static void main(String[] args) {
        String empName;
        double empSalary, tax10;

        Scanner sc = new Scanner(System.in) ;

        System.out.print("Input employee name : ");
        empName = sc.next();
        System.out.print("Input employee Salary : ");
        empSalary = sc.nextDouble();

        System.out.print("----------------------");

        tax10 = empSalary * 10-100;
        System.out.println("Your name : " + empName);
        System.out.println("Your salary : " + empSalary);
        System.out.println("Tax Pay : " + tax10 + "Bath");

    }
}
