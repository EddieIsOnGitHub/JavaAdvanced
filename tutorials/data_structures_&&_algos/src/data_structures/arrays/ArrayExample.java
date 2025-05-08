package data_structures.arrays;

// Fixed size
public class ArrayExample {
    public static void main(String[] args){
        // Create array of strings
        String[] groceryItems={"Apples","Oranges", "Bananas","Cucumbers","Chips"};

        // Iterate through the array
        for(int i=0; i< groceryItems.length;i++){
            System.out.print(groceryItems[i] +", ");
        }

        // Find an element
        System.out.println("\nindex 3: "+groceryItems[3]);

        // remove element
        groceryItems[3]=null;

        System.out.println("Removed item: "+ groceryItems[3]);

        // Check length
        System.out.println("Number of groceries: "+ groceryItems.length);
    }
}
