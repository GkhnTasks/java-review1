package ArrayListReview;

import java.util.*;

public class ArrayList {
    public static void main(String[] args) {

        List<Student> students = new java.util.ArrayList<>();

        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Saved"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));


        System.out.println(students);

        //iteration on arraylist
        //1.for loop
        for (int i = 0; i <students.size(); i++) System.out.println(students.get(i));

        //2.iterator
        //Forward iteration
        Iterator iter = students.listIterator();
        while (iter.hasNext()){

            System.out.println(iter.next());

        }

        //Backwards iteration
//        while (iter.hasPrevious){
//
//            System.out.println(iter.next());
//
//        }

       //3.for each loop
        for (Student student : students) System.out.println(student);

        //4.Lambda
        students.forEach(student -> System.out.println(student));

        // Sorting Elements in List

        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);

        Collections.sort(students,new sortByNameDesc());
        System.out.println(students);


    }

    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
