import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {
        List<Integer> mylist= Arrays.asList(1,2,3,4,5,3,6);
        mylist.forEach(System.out::println);
        System.out.println("---------FILTER------------------");
        //Filter
        mylist.stream()
                .filter(i->i%3==0)
                  .distinct()
                    .forEach(System.out::println);

        //LIMIT
        System.out.println("---------FILTER-----------------");
        mylist.stream()
                .filter(i->i%2==0)
                  .limit(1)
                     .forEach(System.out::println);

        //SKIP
        System.out.println("---------SKIP-----------------");

        mylist.stream()
                .filter(i->i%2==0)
                   .skip(1)
                     .forEach(System.out::println);

        //MAP
        System.out.println("---------MAP-----------------");

        mylist.stream()
                .map(number->number*3)
                  .filter(i->i%2==0)
                     .forEach(System.out::println);

    }
}
