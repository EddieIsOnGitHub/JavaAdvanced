package data_structures.arrayLIsts;

import java.util.ArrayList;
import java.util.List;

// No fixed size
public class Example {
    public static void main(String[] args) {
        // Initialise list
        List<String> groceries= new ArrayList<String>();
        groceries.add("Apple");
        groceries.add("Banana");
        groceries.add("Carrots");
        groceries.add("chips");

        // Print length of array
        System.out.println("Length of array: "+groceries.size());

        // Print all groceries
        for(String item: groceries){
            System.out.print(item+", ");
        }

        // get one element
        groceries.remove(3);

        // check length
        System.out.println("\nSize of list now: "+ groceries.size());

        // Print ouy all elements again
        for(String item: groceries){
            System.out.print(item +", ");
        }
    }
}
