package com.company.javaBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class Level1Methods {

    //class variables
    int a;
    int b;
    int c;
    static double pie = 2.14;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Level1Methods objName = new Level1Methods();
        objName.sumOf(10, 20);
        //objName.userDataSum();
        //objName.userDataProduct();
        //objName.circleInfo();
        //objName.maxAndMin();
        //objName.oddOrEven();
        //objName.voterEligibity();
        //objName.primeNumber();
        objName.gradeYourself();
    }

    //Write a program to print the sum of two numbers entered by user by defining your own method
    public int sumOf(int a, int b) {
        c = a + b;
        System.out.println("Sum of numbers " + a + "and " + b + "is " + c);
        return c;
    }

    public void userDataSum() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        a = scanner.nextInt();
        System.out.println("Enter another number :");
        b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum of the numbers :" + sum);
    }

    //2. Define a method that returns the product of two numbers entered by user.
    public void userDataProduct() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();
        System.out.println("Enter another number:");
        int y = scanner.nextInt();
        int product = x * y;
        System.out.println("Product of the two numbers is " + product);

    }

    //Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
    public void circleInfo() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the radius ");
        int r = scanner.nextInt();
        double circum = 2 * pie * r;
        System.out.println("Circumfrence is : " + circum);
        double area = pie * r * r;
        System.out.println("Area is : " + area);

    }

    //  4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
    public void maxAndMin() {
        System.out.println("Enter the first number :");
        int x = scanner.nextInt();
        System.out.println("Enter the second number :");
        int y = scanner.nextInt();
        System.out.println("Enter the third number :");
        int z = scanner.nextInt();
        ArrayList<Integer> numArr = new ArrayList<>();
        numArr.add(x);
        numArr.add(y);
        numArr.add(z);

        int max = Math.max(Math.max(x, y), z);
        int min = Math.min(Math.min(x, y), z);
        System.out.println("Max number is: " + max);
        System.out.println("Min number is: " + min);

    }

    //5. Define a program to find out whether a given number is even or odd.
    public void oddOrEven() {
        System.out.println("Enter a number other than one : ");
        int p = scanner.nextInt();
        if (p % 2 == 0) {
            System.out.println("The number you is even number");
        } else {
            System.out.println("The number you is odd number");
        }
    }

    //6. A person is elligible to vote if his/her age is greater than or equal to 18
    public void voterEligibity() {
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

    //7. Define a method to find out if number is prime or not.
    public void primeNumber() {
        System.out.println("Enter your number : ");
        int p = scanner.nextInt();
        boolean prime = true;
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                System.out.println("The number is not a prime number");
                prime = false;
                break;
            }
            if (prime = true) {
                System.out.println("The number is a prime number");
            }
        }

    }

    //8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
    //Marks        Grade
    //91-100         AA
    //81-90          AB
    //71-80          BB
    //61-70          BC
    //51-60          CD
    //41-50          DD
    //<=40          Fail
    public void gradeYourself() {
        System.out.println("Enter your score :");
        int score = scanner.nextInt();
        String grade;
        if (score > 91 && score <= 100) {
            grade = "AA";
        } else if (score > 81 && score <= 90) {
            grade = "AB";
        } else if (score > 71 && score <= 80) {
            grade = "BB";
        } else if (score > 61 && score <= 70) {
            grade = "BC";
        } else if (score > 51 && score <= 60) {
            grade = "CD";
        } else if (score > 41 && score <= 50) {
            grade = "DD";
        } else {
            grade = "Fail";
        }

        System.out.println("Your grade is : " + grade);
    }


}




