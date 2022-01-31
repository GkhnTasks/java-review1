package FunctiomalInterfaces;

import java.util.function.Predicate;

public class Example {

    public static void main(String[] args) {

        //********PREDICATE*****************************//
//        Predicate<Integer> lesserThan=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//
//        lesserThan.test(50);

        Predicate<Integer> lesserThan= integer -> integer<18; //implementation of test method that belongs to pricate interface

        Boolean result=lesserThan.test(50);
        System.out.println(result);
    }
}
