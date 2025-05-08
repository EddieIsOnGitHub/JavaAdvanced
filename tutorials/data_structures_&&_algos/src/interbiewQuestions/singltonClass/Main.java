package interbiewQuestions.singltonClass;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getSingleton();
        Singleton singleton2=Singleton.getSingleton();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
