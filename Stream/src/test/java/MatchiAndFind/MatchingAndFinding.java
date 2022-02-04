package MatchiAndFind;

import Task.Dish;
import Task.DishData;

import java.sql.SQLOutput;
import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        // All match
       boolean isHealty= DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories()<1000);

        System.out.println("isHealty = " + isHealty);

        System.out.println("-------------");

        // Any Match
       if (DishData.getAll().stream()
                .anyMatch(Dish::isVegetarian)){
           System.out.println("The menu is vegetarian friendly");
       }

        System.out.println("-------------");

       //Non match
        boolean isHealty2=DishData.getAll().stream()
                .noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println("isHealty2 = " + isHealty2);

        System.out.println("-------------");

        //Find any
        Optional<Dish> dish=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println("dish = " + dish.get());

        System.out.println("-------------");
        // Find First

        Optional<Dish> dish2=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println("dish2 = " + dish2.get());
    }

}
