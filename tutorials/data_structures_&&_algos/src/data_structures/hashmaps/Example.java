package data_structures.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        // Create a hashmap
        HashMap<String, List<String>> countries = new HashMap<String, List<String>>();

        // Create a list of counties
        List<String> G = new ArrayList<String>(){
            {
                add("Ghana");
                add("GreenLand");
                add("Greece");
            }
        };

        List<String> I = new ArrayList<String>(){
            {
                add("India");
                add("Ireland");
                add("Iran");
                add("Iraq");
                add("Italy");
            }
        };

        List<String> U = new ArrayList<String>(){
            {
                add("United States");
                add("United Kingdom");
                add("Uruguay");
            }
        };

        // Initialise hashmap
        countries.put("G", G);
        countries.put("I", I);
        countries.put("U", U);

        // get a list of I's
        List<String> result = countries.get("I");

        for(String country: result){
            System.out.println(country);
        }

        // remove key value
        countries.remove("I");
        System.out.println();

        // Try to get I
        System.out.println("Trying to get I");
        System.out.println(countries.get("I"));
    }
}
