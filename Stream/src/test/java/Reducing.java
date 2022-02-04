import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(4,5,3,9);

        int num=numbers.stream()
                .reduce(0,(a,b)->(a+b));
        System.out.println("num = " + num);

        //No initial value

        Optional<Integer> num1=numbers.stream()
                .reduce((a,b)->(a+b));
        System.out.println("num1 = " + num1+" |"+ num1.get());

        // max and min

       Optional<Integer> min= numbers.stream().reduce(Integer::min);
       Optional<Integer> max= numbers.stream().reduce(Integer::max);
       Optional<Integer> sum=numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
    }
}
