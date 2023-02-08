package Telusko.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithCustomType {
    public static void main(String[] args) {
        List<Student> obj = new ArrayList<>();
        obj.add(new Student(101,500));
        obj.add(new Student(102,600));
        obj.add(new Student(103,700));
        obj.add(new Student(104,800));

        Collections.sort(obj,(s1,s2)->{
            return s1.marks>s2.marks?-1:s1.marks< s2.marks?1:0;
        });

        for (Student s : obj){
            System.out.println(s);
        }
    }
}

class Student {
    int rollNo;
    int marks;

    public Student(int rollNo, int marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}
