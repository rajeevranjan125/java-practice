package lambda.tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CheckDsa {
    public static void main(String[] args) {

        List<Student> lst = new ArrayList<>();

        lst.add(new Student("camara", 86, 3));
        lst.add(new Student("aman", 91, 1));
        lst.add(new Student("babloo", 89, 2));


        SortByNames sortByNames = new SortByNames();
//        SortByMarks sortByMarks = new SortByMarks();
//        SortByRollNo sortByRollNo = new SortByRollNo();

        Collections.sort(lst, sortByNames);

//        Collections.sort(lst, new Comparator<Student>(){
//            @Override
//            public int compare(Student s1, Student s2){
//                return s1.rollNo - s2.rollNo;
//            }
//        });

        Collections.sort(lst, (s1, s2) -> s1.marks - s2.marks);


        lst.forEach(s -> System.out.println(s.name + " " + s.rollNo + " " + s.marks));
    }
}

class SortByNames implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        return s1.name.compareTo(s2.name);
    }
}
//
//class SortByMarks implements Comparator<Student> {
//
//    @Override
//    public int compare(Student s1, Student s2) {
//        return s1.marks - s2.marks;
//    }
//}
//
//class SortByRollNo implements Comparator<Student> {
//
//    @Override
//    public int compare(Student s1, Student s2) {
//
//        return s1.rollNo - s2.rollNo;
//    }
//}

class Student {
    String name;
    int marks;
    int rollNo;

    public Student(String name, int marks, int rollNo) {
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }
}