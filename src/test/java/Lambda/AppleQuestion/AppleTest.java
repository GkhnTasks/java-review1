package Lambda.AppleQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {

    public static void main(String[] args) {
        List<Apple> inventory=new ArrayList<>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(40,Color.RED));
        inventory.add(new Apple(600,Color.RED));

        List<Apple> heavyApple=filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);


        List<Apple> greenApple=filterApples(inventory,new AppleGreenColurPredicate());
        System.out.println(greenApple);

        System.out.println("-----function------");
        System.out.println("filterApples(inventory,apple-> apple.getWeight()>150) = " + filterAppleslambda(inventory, apple -> apple.getWeight() > 150));

        System.out.println("filterAppleslambda(inventory,p->p.getColor().equals(Color.RED)) = " + filterAppleslambda(inventory, p -> p.getColor().equals(Color.RED)));
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {

        List<Apple> result=new ArrayList<>();

        for (Apple apple: inventory){

            if ((applePredicate.test(apple))){
                result.add(apple);
            }
        }

      return result;
    }

    private static List<Apple> filterAppleslambda(List<Apple> inventory, Predicate<Apple> ap) {

        List<Apple> result=new ArrayList<>();

        for (Apple apple: inventory){

            if ((ap.test(apple))){
                result.add(apple);
            }
        }

        return result;
    }


}
