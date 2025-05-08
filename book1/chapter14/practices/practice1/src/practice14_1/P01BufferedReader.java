package practice14_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class P01BufferedReader {
    
    public static void main(String[] args) {
        
        try{
            BufferedReader bReader = 
                new BufferedReader(new FileReader("C:/BootCamp/9_Java_Advanced/My_Java/book1/chapter14/practices/practice1/hamlet.txt"));
            
            System.out.println("=== Entire File ===");
            bReader.lines()
                .forEach(line -> 
                    System.out.println(line));
                        
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    } 
}
