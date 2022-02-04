package Task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;


public class DishTest {

    public static void main(String[] args) {

      List<Dish> menu= Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
               new Dish("beeef",false,700,Type.MEAT),
               new Dish("chicken",false,400,Type.MEAT),
               new Dish("fries",true,300,Type.FISH),
               new Dish("rice",true,200,Type.OTHER)

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

        System.out.println("----Lesson------------");

        //Print all dish name that has less than 400 calories

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                    .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("*******************");

        //Print the length of the name each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("*******************");

        //Print 3 high caloric dish name (>3000

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("*******************");

        //Print all dishes name that are below 400 calories sorted

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
              // .sorted(comparing(Dish::getCalories))
                .sorted()
                .forEach(System.out::println);

    }
}
