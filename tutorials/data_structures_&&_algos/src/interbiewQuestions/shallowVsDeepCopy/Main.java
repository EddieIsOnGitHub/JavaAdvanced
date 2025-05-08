package interbiewQuestions.shallowVsDeepCopy;

public class Main {
    public static void main(String[] args) {

        //Shallow copy
//        Example example1=new Example();
//        example1.x=100;
//
//        Example example2=example1;
//        example2.x=200;
//
//        System.out.println(example1.x);

        //Deep copy
        Example example1=new Example();
        example1.x=100;

        Example example2=new Example();
        example2.x=200;

        System.out.println(example1.x);
    }
}
