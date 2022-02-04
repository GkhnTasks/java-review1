package DoubleColon;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class demo {

    public static void main(String[] args) {

        //Reference to a static method
        Calculate s1= (x,y)-> Calculater.findsum(x,y);
        s1.calculate(10,20);

        Calculate s2=Calculater::findsum; //same to line 11
        s2.calculate(32,45);

        //Reference to instance method
        Calculate m1=(x,y)->  new Calculater().finMultiply(x,y);
        m1.calculate(34,56);

        Calculater obj=new Calculater();
        Calculate m2=obj::finMultiply;
        m2.calculate(55,67);

        Calculate m3=new Calculater()::finMultiply;
        m3.calculate(6,5);


        BiFunction<String,Integer,String> fn=(str,i)->str.substring(i);
        System.out.println(fn.apply("Developer",5));

        BiFunction<String,Integer,String> fn2= String::substring;
        System.out.println(fn2.apply("Developer",5));

        Consumer<Integer> display=i -> System.out.println(i);
        display.accept(45);


        Consumer<Integer> display2= System.out::println;
        display.accept(34);


       // BiFunction<MyClas,Integer,Double> v2= new MyClas()::method;

    }
}
