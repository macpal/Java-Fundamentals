package java8features.lambda;

import java.sql.SQLOutput;

interface Interf {
    public void add(int a, int b);
}

class Demo implements Interf{
    @Override
    public void add(int a, int b) {
        System.out.println("The sum:"+(a+b));
    }
}

//class Demo implements  Interf {
//    @Override
//    public void m1() {
//        System.out.println("Hello...");
//    }
//}
public class Main {
    public static void main(String[] args) {
//        Demo d = new Demo();
//        d.m1();

//        Interf i = new Demo(); // Parent's reference can be used to hold child object.
//        i.m1();

//        Interf i = ()-> System.out.println("Hello..."); // Function Interface is required to provide reference to lambda expression.
//        i.m1();
        Interf i = (a, b)-> {System.out.println("The sum:"+(a+b));};
        i.add(10,30);

    }
}
