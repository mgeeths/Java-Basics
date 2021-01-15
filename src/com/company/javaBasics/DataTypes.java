package com.company.javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class DataTypes {

    public static void main(String[] args) {
        // Primitive data types
        char a = 'A';
        char b = 'B';
        char c = 'C';
        String s = "My own String";
        /*
        System.out.println(s + a); //My own StringA
        System.out.println(s + a + b); //My own StringAB
        System.out.println(a + s); //AMy own String
        System.out.println(c + a); //132

        System.out.println(b + a + s);//131My own String
        System.out.println(++a); //B, not the ASCII value

        int p = 5;
        int q = p++;
        //post increment , hence assign the original value of p to q and then increase p's value
        System.out.println("P= " + p + " and Q=" + q);// P= 6 and Q=5

        int u = 7;
        int v = --u;// pre decrement, first decrease the value to assign it to V, U also gets decreased
        System.out.println("U= " + u + " and V=" + v);// U= 6 and V=6

        int total = 120;
        System.out.println("Total is " + total++);// total is 120 not 121

        System.out.println("Total is " + total++);// Now total is 121, as it got increased after execution of line 30

        System.out.println(++a); //B, not the ASCII value, only char with concatenation takes the conversion

        // Pre and post increment can be done only on number & char data types not on String or Boolean.

        // if else statements:
        String name = "Rob";
        if (name.equals("Rob")) {
            System.out.println("Hello Rob");
        } else {
            System.out.println("Hello Bob");
        }

        //Nested if else statements: Used to check if a cond is met and then another cond is satisfied.
        // eg: if score is over 50 - pass and then if score is also over 90 - A/80-B/70-C
        // the first if {} will contain another if{}

        int score = 75;
        if (score > 60) {
            System.out.println("You've passed");
            if (score > 90) {
                System.out.println("And your grade is A");
            } else if (score > 80) {
                System.out.println("And your grade is B");
            } else if (score > 70) {
                System.out.println("And your grade is C");
            }
            else if (score > 60) {
                System.out.println("And your grade is D");
            }
        } else {
            System.out.println("You failed");
        }

        // The else if cond makes sure that once the cond is met the execution stops checking for further cond
        // But it does still go through every if cond until the cond is met. Incase there are 100 cond, then
        // every if will checked until the cond is met. To avoid this, we have to use the Swtich case st.

        String fName = "Cob";
        switch (fName){
            case "Rob":
                System.out.println("My name is Rob");
                break;
        }
        switch (fName){
            case "Bob":
                System.out.println("My name is Bob");
                break;
        }
        switch (fName){
            case "Cob":
                System.out.println("My name is Cob");
                break;
        }
        // In a switch statement, there only be a key (fName)not a condition  and the break st should be present
        //to break the execution once the cond is met. Now the control directly goes to Cob and not Rob or Bob.
        //They never get executed.



        // WAP to find the max of 4 different numbers
        int g = 8;
        int h = 10;
        int i = 59;
        int j = 72;

        if (g>h && g>i && g>j){
            System.out.println("The max of 4 numbers is g " + g);
        }
        else if (h>i && h>j){
            System.out.println("The max of 4 numbers is h " + h);
        }
        else if (i>j){
            System.out.println("The max of 4 numbers is i " + i);
        }
        else {
            System.out.println("The max of 4 numbers is j " + j);
        }

        //WAP to print Hello LastName in two separate lines:
        String lName = "Walter";
        System.out.println("Hello\n" + lName);
        //System.out.println(lName);

        //WAP to print the sum of two numbers
        int n1 = 74;
        int n2 = 35;
        int sum = n1 + n2;
        System.out.println("Sum of n1 and n2 is " + sum);

        // WAP to divide 50/3
        int n3 = 50;
        int n4 = 3;
        int ans = n3/n4;
        System.out.println("Dividing 50/3 gives " + ans);

        //WAP -5 + 8 * 6 = 43
        int answer = -5+(8*6);
        System.out.println(answer);

        //WAP for  (55+9) % 9 =1
        int solution =  (55+9) % 9;
        System.out.println(solution);

        //WAP for 20 + -3*5 / 8 = 19
        int ans1 = 20 + (-3*5) / 8;
        System.out.println(ans1);

        // WAP for 5 + 15 / 3 * 2 - 8 % 3 =13
        int ans2 = 5 + (15 / 3 )* 2 - (8 % 3);
        System.out.println(ans2);

        //WAP for ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = 2.13888889
        double ans3 = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(ans3);

        //WAP to concat Hello Selenium with char t
        String s1 = "Hello Selenium";
        char t = 't';
        System.out.println(s1 + t);

        //WAP to print the sum of 100 + 200+3400
        String s2 = "Selenium";
        int total1 = 100+200+3400;
        System.out.println("Sum of the numbers 100,200,3400 is " + total1);

        //WAP for printing byte b3 = 065;
        byte b3 = 065;
        System.out.println(b3);

        // WAP to test a number is positive or negative.
        int num = -11;

        if (num>=0){
            System.out.println("Your number is a positive number " + num);
        }
        else{
            System.out.println("Your number is a negative number " + num);

        }


        String sentence = "Here is a list of words for practise : Apple, Banana, Cutie, Apple, Band";
        System.out.println(sentence.indexOf('e'));
        System.out.println(sentence.indexOf("e",sentence.indexOf('e')+1));

        String data1 = "200Star";
        String data2 = data1.substring(0,data1.indexOf("Star"));
        System.out.println(data2);
        int value = Integer.parseInt(data2);
        System.out.println(value+20);

        String entireString = "Apple/Banana/Cutie/Dates";
        String[] splitString = entireString.split("/");
        for(String e:splitString){
            System.out.println(e);
        }


        //1.  Write a program to check two different strings equality.
        String cell1 = "Hawaii";
        String cell2 = "Maui";
        System.out.println(cell1.equals(cell2));

        String cell3 = "maui";
        System.out.println(cell3.equalsIgnoreCase(cell2));

        //2. Remove all  spaces in a String .
        String cell4 = "    Hello  Everyone";
        System.out.println(cell4.replaceAll("\\s",""));

        //3. Write a program that will  print out the last character and first character of a word.
        System.out.println("First Char is: " + cell1.charAt(0)+ " and Last Char is: "+ cell1.charAt(cell1.length()-1));

        //4. Write a program to verify a word or a character contained in the sentence.
        System.out.println(cell4.contains("llo"));
        System.out.println(cell4.contains("h"));
*/
        //5.Write a function/ method to reverse your own name.
        String cell5 = "Geetha";
        char[] nameArr = cell5.toCharArray();
        ArrayList<String> strArr = new ArrayList<>();
        for(int i=nameArr.length-1;i>=0;i--){
            System.out.println(nameArr[i]);
            strArr.add(String.valueOf(nameArr[i]));
        }
        System.out.println(String.join(", ",strArr).replaceAll(", ",""));
        ArrayList<String> lastArr = new ArrayList<>(Arrays.asList("a","c","s","f"));
        String fine = String.join(", ",lastArr);
        System.out.println(fine.replaceAll(", ",""));

        //Easier function to reverse a String
        String lName = "Chidambaram";
        String revName = "";
        for(int i = lName.length()-1; i>=0; i--){
            revName= revName+lName.charAt(i);
        }
        System.out.println(revName);
        //6. Write a program that gives you the last half of the string.
        String cell6 = "Have a nice dayHave a nice day";
        System.out.println(cell6.substring(cell6.length()/2));

        //7.Write a program to get the 3rd  “ e “ of the string .
        int thirdE = cell6.indexOf("e",cell6.indexOf('e')+1);
        System.out.println(thirdE);

        //8. Write a method which gives an index of (-1) if string is not available. .
        // it should return integer. if String is present, then it should return the specific index.
        String phrase = "This is my dog";
        int num = phrase.indexOf("q");
        System.out.println(num);

        //9. Write a program that breaks a whole string into small strings and prints out its all values Hint:split,loop
        String cell8 = "Apple Banana Oranges Lemons";
        String[] eachDataArr = cell8.split(" ");
        for (String r:eachDataArr){
            System.out.println(r);
        }

        //10. Assume that a string consists of 3 words, print out the middle one.
        String cell10 = "One Two Three";
        String[] eachNumArr = cell10.split(" ");
        int middleCount = Math.round(eachNumArr.length/2);
        System.out.println(eachNumArr[middleCount]);

        //11. get only numeric part from this String:
        String s1 = "your transaction id is: 12345 and reference id is 34567";
        String n1 = s1.substring(s1.indexOf(":")+2,s1.indexOf("and"));
        String n2 = s1.substring(s1.lastIndexOf("is")+3);
        //System.out.println(n2);
        System.out.println("Numbers in the string are : "+n1 +" and "+ n2);



    }
}
