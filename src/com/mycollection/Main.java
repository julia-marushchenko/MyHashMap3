 /**
 *  Java program to demonstrate usage of HashMap.
 */

 package com.mycollection;

 import java.util.HashMap;
 import java.util.Map;

 /**
 *  com.mycollection.Main class.
 */
public class Main {

    // Main method to drive java program.
    public static void main(String[] args) {

        // Creating HashMap<>.
        HashMap<Integer, String> myHM = new HashMap<>();

        // Adding values to myHM.
        myHM.put(1, "Longsleeve");
        myHM.put(2, "Jeans");
        myHM.put(3, "Pants");
        myHM.put(4, "Jemper");

        // Printing key-values pairs of myHM.
        for (Map.Entry elements : myHM.entrySet()) {

            System.out.println(elements.getKey() + " : " + elements.getValue());

        }

        /*
        Output:
        1 : Longsleeve
        2 : Jeans
        3 : Pants
        4 : Jemper
         */
    }
}