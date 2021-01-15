package com.company.javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeJava {
    public static void main(String[] args) {
        //WAP to reverse a string
        String word = "h,e,l,l,o";
        List<String> myList = new ArrayList<String>(Arrays.asList(word.split(",")));
        System.out.println(myList);

        ArrayList<String> revWord = new ArrayList<>();

        for(int i=myList.size()-1; i>=0; i--){
            revWord.add(myList.get(i));

        }
        System.out.println(revWord);
    }

}
