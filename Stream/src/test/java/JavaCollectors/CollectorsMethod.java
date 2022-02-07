package JavaCollectors;

import Task.Dish;
import Task.DishData;
import Task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsMethod {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier); is used to create collection using collector
        System.out.println("-------TOCOLLECTION----------");
        List<Integer> numberList=numbers.stream()
                .filter(x->x%2==00)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("numberList = " + numberList);

        Set<Integer> numberSET=numbers.stream()
                .filter(x->x%2==00)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println("numberSET = " + numberSET);

        //tolist(); return a Collector interface that gathers the input data into a new list

        System.out.println("-------TOLIST----------");

        List<Integer> numberListTo=numbers.stream()
                .filter(x->x%2==00)
                .collect(Collectors.toList());

        System.out.println("numberListTo = " + numberListTo);

        //toSet(); returns a Collector interface that gathers the input data into a new set
        System.out.println("-------TOSET----------");
        Set<Integer> numberSet2=numbers.stream()
                .filter(x->x%2==00)
                .collect(Collectors.toSet());
        System.out.println("numberSet2 = " + numberSet2);

        //toMap(Function,Function); returns a Collector interface that gathers the input data into a new map
        System.out.println("-------TOMAP----------");
       Map<String,Integer> dishMap= DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println("dishMap = " + dishMap);

        //counting (): return a collector that count the number of the elements
        System.out.println("-------COUNTING----------");

       Long evenCount= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println("evenCount = " + evenCount);

        //summing(ToIntFunction): returns a collector that produces the sum of a integer-value func
        System.out.println("-------SUMMING----------");

        Integer sum=DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = " + sum);

        //averageing(ToIntFunction): returns the average of the integers passed values
        System.out.println("-------AVERAGING----------");
        Double average=DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("aver = " + average);

        //joining(): is used to join various elements of a character of string array into a single string object

        System.out.println("-------JOINING----------");

        List<String> courses=Arrays.asList("Java","JS","TS");
        String str=courses.stream()
                .collect(Collectors.joining("'"));
        System.out.println("str = " + str);

        //partioningBy(): is used to partition a stream of objects or set of elements based on a given predicate
        System.out.println("-------PARTITIONING----------");
        Map<Boolean,List<Dish>>vegaDish=DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println("vegaDish = " + vegaDish);

        //groupinBy(): is used for grouping objects by some property and storing result is an instance
        System.out.println("-------GROUPINBY----------");
       Map<Type,List<Dish>> dishType=DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println("dishType = " + dishType);



    }
}
