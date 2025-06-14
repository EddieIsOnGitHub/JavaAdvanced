package practice14_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class P04NioReadAll {
  public static void main(String[] args) {
        
    Path file =  Paths.get("C:\\\\Code College\\\\bootcamp\\\\New folder\\\\Java Advanced\\\\book1\\\\chapter14\\\\practices\\\\practice1/hamlet.txt");
    List<String> fileArr;

    try{
        fileArr = Files.readAllLines(file);

        System.out.println("\n=== Lord Count ===");
        long wordCount = fileArr.stream()
            .flatMap(line -> Stream.of(line.split(" ")))
            .filter(word -> word.contains("lord"))
            .peek(word -> System.out.println(word))
            .count();
        System.out.println("Word count: " + wordCount);

        System.out.println("\n=== Prison Count ===");
        wordCount = fileArr.stream()
            .flatMap(line -> Stream.of(line.split(" ")))
            .filter(word -> word.contains("prison"))
            .peek(word -> System.out.println(word))
            .count();
        System.out.println("Word count: " + wordCount);            

    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }
  } 
}
