import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //creating stream from array
        String[] courses={"Java","JS","TS"};
        Stream<String> courseStream=Arrays.stream(courses);


        // Creating Stream from Collection

        List<String > courseList=Arrays.asList("Java","DS","Spring");
        Stream<String> courseStream2=courseList.stream();


        List<Course> myCourses=Arrays.asList(
                new Course("Java",100),
        new Course("DS",102),
        new Course("Spring", 102)
        );

        Stream<Course> myCourseStream=myCourses.stream();


        //Creating Stream from values

        Stream<Integer> stream=Stream.of(1,2,3,4);

    }
}
