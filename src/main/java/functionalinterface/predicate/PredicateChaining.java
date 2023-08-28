package functionalinterface.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateChaining {

    public static void main(String[] args) {


        Predicate<Integer> evenNumberPredicate = num -> num % 2 == 0;

        Predicate<Integer> numberGrthn5 = num -> num > 5;
        Predicate<Integer> numberLesstn10 = num -> num < 10;



        System.out.print("Even number :: ");
        System.out.println(evenNumberPredicate.test(2));

        System.out.print("Odd  number :: ");
        System.out.println(evenNumberPredicate.negate().test(1));

        System.out.print("Number greater than 5 and less than 10 ::");
        System.out.println(numberGrthn5.and(numberLesstn10).test(9));

    }
}
