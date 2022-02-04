package flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){

        return Stream.of(
                new Employee(100,"Mike","mike@mail.com",
                        Arrays.asList("7267326723","23762388")),
                new Employee(101,"Ozzy","ozzy@mail.com",
                        Arrays.asList("56676776783","78865448")),
                new Employee(102,"Peter","peetty@mail.com",
                        Arrays.asList("333446723","1223388"))

        );
    }
}
