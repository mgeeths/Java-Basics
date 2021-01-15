package com.company.javaBasics;

import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {
/*
        //1. WAP to print a text five times
        String myStr1 = "I am a Batman";
        for (int i = 1; i <= 5; i++) {
            System.out.println(myStr1);
        }

        //2. WAP to print a text with a increasing variable
        for (int x = 1; x <= 9; x++) {
            String myStr2 = "I am a Batman";
            System.out.println(myStr2 + " " + x);
        }

        //3. WAP to print 10 to 1 using for, while and do-while loop
        //using for
        for(int a =10; a>=1; a--){
            System.out.println(a);
        }

        //using while loop
        int b = 10;
        while (b>=1){
            System.out.println(b);
            b--;

        }

        //using do while loop

        int c = 10;
        do {
            System.out.println(c);
            c--;
        }
        while (c > 0);


        //4. Write a program in Java to print "Hello World" ten times using while loop
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Hello World");
            counter++;
        }

        //5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered

        int n = 1;
        while (n <= 10) {
            if (n % 7 == 0) {
                //System.out.println(n);
                break;
            }
            System.out.println(n);
            n++;
        }

        //6. Write a program in Java to print 1 to 10 using while loop but skip if multiple of 7 is encountered

        int num = 1;
        while (num <= 10) {
            if (num % 7 == 0) {
                //System.out.println(n);
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }

        for (int z=1; z<10; z++){
            if (z % 3 == 0){
                continue;
            }
            System.out.println(z);
        }

    // WAP to print odd numbers from 1 - 10
        for(int d = 1; d<=10; d=d+2){
            System.out.println(d);
        }

    // WAP to print even numbers with modulus operator
        for (int e=1; e<=20; e++){
            if (e%2 == 0){
                System.out.println(e);
            }
        }

        // WAP to print 00 01 02 03 04 05 06 07 08 09
        for(int q= 0; q<10; q++){
            System.out.printf("%02d%n", q);
        }

        // WAP to print 10 11 12 13 14 15 16 17 18 19
        for(int v = 10; v<=19; v++){
            System.out.println(v);
        }

 */
        //WAP to print 20 21 22 23 24 25 26 27 28 29
        for(int m = 20; m<=29; m++){
            System.out.println(m);
        }

        // WAP to print n = 4
        //n = 3
        //n = 2
        //n = 1
        //n = 0
        for(int a = 4; a>=0; a--) {
            System.out.println("n = " + a);
        }

        // WAP to print 00 01 02 03 04 05 06 07 08 09
        for(int r=0; r<=9; r++){
            for(int t=0; t<=9; t++){
                System.out.print(r + ""+t+" ");
            }System.out.println();
        }
    }
}
