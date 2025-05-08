package interbiewQuestions.contructorVsMethod;

public class Example {
    int x;
    // constructor
    Example(int x){
        System.out.println("I am the constructor");
        this.x=x;
    }

    //Method
    public void printStuff(){
        System.out.println("I am the printStuff method");
    }
}
