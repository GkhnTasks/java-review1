package FunctiomalInterfaces;

import java.util.function.*;

public class Example {

    public static void main(String[] args) {

        //********PREDICATE*****************************//
        System.out.println("********PREDICATE*****************************");
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

        //********CONSUMER*****************************//
        System.out.println("********CONSUMER*****************************");

        Consumer<Integer> display=i-> System.out.println(i);
        display.accept(50);

        //********BICONSUMER*****************************//
        System.out.println("********BICONSUMER*****************************");

        BiConsumer<Integer,Integer> addTwo=(x,y)-> System.out.println(x+y);
        addTwo.accept(29,22);


        //********FUNCTION*****************************//
        System.out.println("********FUNCTION*****************************");

        Function<String,String> fun=s-> "Hello"+s;
        System.out.println("fun.apply(\"GG\") = " + fun.apply(" GG"));

        //********SUPPLIER*****************************//
        System.out.println("********SUPPLIER*****************************");

        Supplier<Double> randomValue= ()->Math.random();
        System.out.println("randomValue.get() = " + randomValue.get());






    }
}
