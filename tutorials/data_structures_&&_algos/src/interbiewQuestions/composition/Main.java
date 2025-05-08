package interbiewQuestions.composition;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        System.out.println("I am the main block");
    }

    static {
        System.out.println("I am the static block");
    }
}
