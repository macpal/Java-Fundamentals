package org.example;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Function is found in java.util.function.Function;
        Function<Integer, Integer> f = i->i*i;
//        System.out.println("Square of 40: "+ f.apply(40));
//        System.out.println("Square of 40: "+ f.apply(50));

        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(4)); // result = true
        System.out.println(p.test(5)); // result = false


    }

}