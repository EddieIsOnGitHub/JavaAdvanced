package data_structures.queue;

import java.util.LinkedList;
import java.util.Queue;

// FIFO - First In First Out
public class Example {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // print the queue
        System.out.println("Queue: "+queue);

        // remove element from the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: "+front);

        // print the updated queue
        System.out.println("Queue after removal: "+queue);

        // add another element to queue
        queue.add("date");

        // peek at the front
        String peeked = queue.peek();
        System.out.println("Peeked element: "+peeked);

        // print the updated queue
        System.out.println("Queue after peek: "+queue);
    }
}
