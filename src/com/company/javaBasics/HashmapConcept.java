package com.company.javaBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * no order-- no indexing
 * stores value in key & value pair format
 * key cannot be duplicate, it does not give error, instead gives the latest value
 * allows storing multiple null values
 * but only one null key
 * HashMap is not thread safe- not synchronized, just like Array List
 */

public class HashmapConcept {

    public static void main(String[] args) {


        HashMap<String, String> capMap = new HashMap<String, String>();
        capMap.put("India", "New Delhi");
        capMap.put("USA", "Washington DC");
        capMap.put("UK", "London");
        capMap.put("Bharat", "New Delhi");
        capMap.put("null", "LA");
        capMap.put("Russia", null);
        capMap.put("France", null);

        //System.out.println(capMap.get("India"));

        //Fetch using iterators - for Keys alone
        Iterator<String> it = capMap.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        //Fetch the values alone

        Iterator<String> it2 = capMap.values().iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        for (String e : capMap.values()) {
            System.out.println(e);
        }

        //Fetch using iterators - for the whole set - pairs --- Use <Map.Entry<Str,Str>> as the data type of Iterator
        Iterator<Map.Entry<String, String>> it1 = capMap.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<String, String> entry = it1.next();
            System.out.println("Key is : " + entry.getKey() + "   Value is : " + entry.getValue());
        }

        //Fetch using for Each & lambda
        capMap.forEach((k,v)->System.out.println("Key is : "+ k +"  and Value is : "+ v)) ;

    }
}
