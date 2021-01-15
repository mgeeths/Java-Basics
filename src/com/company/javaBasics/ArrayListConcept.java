package com.company.javaBasics;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayListConcept {
    public static void main(String[] args) {

        // WAP to create a static array with --name, age, team name, DOB, gender, Strike Rate
        Object[] palyer1Arr = {"Adam", 33, "Australia", "30-Sep-1975", 'M', 75.36};
        Object[] palyer2Arr = {"Irfaan", 35, "India", "30-Sep-1975", 'M', 55.38};
        Object[] palyer3Arr = {"Monal", 34, "Sri Lanka", "30-Sep-1975", 'F', 85.57};
        Object[] palyer4Arr = {"Eric", 32, "England", "30-Sep-1975", 'M', 95.36};

        System.out.println(Arrays.toString(palyer1Arr));
        System.out.println(Arrays.toString(palyer2Arr));
        System.out.println(Arrays.toString(palyer3Arr));
        System.out.println(Arrays.toString(palyer4Arr));


        //Directly passing values to the array while declaring:
        int [] scoresStArr = {200,300,500,600,800,};
        for(int i=0; i<scoresStArr.length; i++ ){
            System.out.println(scoresStArr[i]);
        }

        //First declare the arr var nd then assign values:
        String [] empNames = new String[3];
        empNames[0] = "Geetha";
        empNames[1] = "Seetha";
        empNames[2] = "Preetha";
        empNames[3] = "Jeetha" +
                "";


  /*
        // WAP to create a new array list, add some colors (string) and print out the collection
        ArrayList<String> colorsArr = new java.util.ArrayList<String>();
        colorsArr.add("Pink");
        colorsArr.add("Blue");
        colorsArr.add("Orange");
        colorsArr.add("Yellow");
        colorsArr.addAll(Arrays.asList("Maroon", "Magenta", "Marigold"));
        System.out.println(colorsArr);

        //2. WAP to insert an element into the array list at the first and last positions
        colorsArr.add(0, "Gold");
        colorsArr.add("Silver");
        System.out.println(colorsArr);

        //3. WAP to retrieve an element (at a specified index) from a given array list.
        System.out.println(colorsArr.get(3));

        //4. WAP to update specific array element by given element.
        colorsArr.set(2 , "Tan");
        System.out.println(colorsArr);

        //5. WAP to remove the third element from a array list.
        int prevSize = colorsArr.size();
        System.out.println("Prev size = " + prevSize);
        colorsArr.remove(2);
        int currSize = colorsArr.size();
        System.out.println("Curr size = " + currSize);
        System.out.println(colorsArr);

        //6. WAP to search an element in a array list.
        System.out.println(colorsArr.contains("Pink"));
        System.out.println(colorsArr.contains("Tan"));

        //7. WAP to reverse elements in a array list
        ArrayList<Integer> leapYears = new ArrayList<>();
        leapYears.addAll(Arrays.asList(2020,2016,2012,2008,2004,2000));

        ArrayList<Integer> revLeapYears = new ArrayList<>();
        for(int index = leapYears.size()-1; index>=0; index--){
            revLeapYears.add(leapYears.get(index));
        }
        System.out.println(revLeapYears);

        //8. WAP to extract a portion of a array list - first 4 colors
        ArrayList<String> subColorsArr = new ArrayList<String>(colorsArr.subList(0,4));
        System.out.println(subColorsArr);

        //9. WAP of swap two elements in an array list.
        Collections.swap(colorsArr,1,3);
        System.out.println(colorsArr);

        //10. WAP to empty an array list.
        System.out.println(leapYears);
        leapYears.clear();
        System.out.println(leapYears);

        //11. WAP to trim the virtual capacity of an array list the current list size.
        subColorsArr.trimToSize();

        //12. WAP to print all the elements of a ArrayList using the position of the elements
        for(int k = 0; k<colorsArr.size(); k++){
            System.out.println(colorsArr.get(k));
        }

        //Using removeIf with lambda expr
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,15,35,6,56));
        numbersList.removeIf(ele -> ele%2 == 0);
        System.out.println(numbersList);

        //Using retain all method
        ArrayList<String> menuItems = new ArrayList<>(Arrays.asList("Idly","Dosa","Chutney","Sambar","Podi","Idly","Dosa","Chutney","Sambar"));
        ArrayList<String> tiffinItems = new ArrayList<>(Arrays.asList("Idly","Dosa","Chutney","Sambar"));
        menuItems.retainAll(tiffinItems);
        //menuItems.retainAll(Collections.singleton("Idly"));
        System.out.println(menuItems);

        //Converting an arraylist to synchronized ArrayList using Collections.syn method
        List<String> menuList = Collections.synchronizedList(menuItems);
        synchronized (menuList){
            Iterator it = menuList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        //Using CopyOnWriteAL - DOES NOT NEED THE KEYWORD SYNCHRONIZED. It is already thread safe
        CopyOnWriteArrayList<Integer> marks = new CopyOnWriteArrayList<>();
        marks.addAll(Arrays.asList(4,5,8,7,9,8,3,5,2));
        Iterator it = marks.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

       //Remove Duplicate elements in an AL using Linked HashSet- set cannot have dup elements
        ArrayList<Integer> numbersList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,15,35,6,56));
        LinkedHashSet<Integer> allNumberSet = new LinkedHashSet<>(numbersList1);

        ArrayList<Integer> distincyNumbersList = new ArrayList<>(allNumberSet);
        System.out.println(distincyNumbersList);

        //Remove Duplicate elements in an AL using Java streams - returns LIST OBJECT
        ArrayList<Integer> votersList = new ArrayList<>(Arrays.asList(15,2,35,4,55,6,7,8,9,15,35,6,55));

        List<Integer> distVotersList  = votersList.stream().distinct().collect(Collectors.toList());
        System.out.println(distVotersList);

        //Compare two AL -first sort them
        ArrayList<String> alphaList1 = new ArrayList<>(Arrays.asList("a","f","e","r"));
        ArrayList<String> alphaList2 = new ArrayList<>(Arrays.asList("a","r","e","f"));
        Collections.sort(alphaList1);
        Collections.sort(alphaList2);
        System.out.println(alphaList1.equals(alphaList2));

        //Find the additional elements between two AL- returns a boolean value, so do not return it
        ArrayList<String> alphaList3 = new ArrayList<>(Arrays.asList("a","f","e","r","w","r","o"));
        ArrayList<String> alphaList4 = new ArrayList<>(Arrays.asList("a","r","e","f","s","c"));
        //alphaList3.removeAll(alphaList4);
        //System.out.println(alphaList3);

        //Find the missing elements between two AL- returns a boolean value, so do not return it
        //alphaList4.removeAll(alphaList3);
        System.out.println(alphaList4);


        //Find the common elements between two AL- returns a boolean value, so do not return it
        alphaList3.retainAll(alphaList4);
        System.out.println(alphaList3);

        ArrayList<String> numerals = new ArrayList<>(alphaList3);
        System.out.println(alphaList3);

        numerals.stream().forEach(n-> System.out.println(n));
*/
    }

}
