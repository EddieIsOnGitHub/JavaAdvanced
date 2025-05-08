package data_structures.stack;

import java.util.Stack;

// LIFO - Last In First Out
public class Example {
    public static void  main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.push("NMW");
        stack.push("Corvette");
        stack.push("Lambo");

        System.out.println("peek: "+stack.peek());
        System.out.println("pop: "+ stack.pop());

        stack.push("Toyota Camry");
        System.out.println("peek: "+stack.peek());
    }
}
