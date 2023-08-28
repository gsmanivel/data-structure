package functionalinterface.predicate;


import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateBasic {

    /*
    Predicate functional interface takes input and returns Boolean value  (true / false)

     */

    public static void main(String[] args) {

        Predicate<Integer> predicate = number -> number >10;

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(100));

        //System.out.println(predicate.test("mani"));   //error: incompatible types: String cannot be converted to Integer


        // Test if given arraylist is empty or not

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("mani");

        Predicate<ArrayList<String>> isEmptyList = list -> list.size()<0;
        System.out.println(isEmptyList.test(nameList));
    }
}
