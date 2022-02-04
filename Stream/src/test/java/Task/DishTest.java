package Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DishTest {

    public static void main(String[] args) {

        List<Dish> menu= Arrays.asList(
                new Dish("pork",Type.MEAT,800,false),
                new Dish("beeef",Type.MEAT,700,false),
                new Dish("chicken",Type.MEAT,400,false),
                new Dish("fries",Type.FISH,300,true),
                new Dish("rice",Type.OTHER,200,true)

        );


        Stream<Dish> stream1= menu.stream();

        //get all name
        stream1
                .map(Dish::getName)
                .forEach(System.out::println);


        System.out.println("-----------------");
        Stream<Dish> stream2= menu.stream();
        stream2
                .filter(i->i.getCalories()<400)
                   .map(Dish::getName)
                       .forEach(System.out::println);


    }
}
