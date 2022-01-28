package SetReview;

import ArrayListReview.Student;

import java.util.HashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {
        //1. Create a set

        Set<Student> mySet= new HashSet<>();

        // add elements
        mySet.add(new Student(7,"Ibadi"));
        mySet.add(new Student(8,"George"));
        mySet.add(new Student(9,"Mike"));
        mySet.add(new Student(9,"Mike"));

        System.out.println(mySet);


        Set<Integer> numSet=new HashSet<>();

        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        numSet.add(2);
        System.out.println(numSet.add(2));


        System.out.println("first repeting ch : "+firstrepetingChar("Java Developer"));

    }

    public static Character firstrepetingChar(String str){
        //i will create hashmap
        //start iterartion return ch if add returns false

        Set<Character> chars=new HashSet<>();

        for (Character ch : str.toCharArray()) if (!chars.add(ch)) return ch;
        return  null;

    }
}
