package Telusko.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args) {
        List<Student1> obj = new ArrayList<>();
        obj.add(new Student1(101,500));
        obj.add(new Student1(102,600));
        obj.add(new Student1(103,700));
        obj.add(new Student1(104,800));
        Collections.sort(obj);
        System.out.println(obj);
    }
}

class Student1 implements Comparable<Student1>{
    int rollNo;
    int marks;

    public Student1(int rollNo, int marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public int compareTo(Student1 s) {
        return this.marks>s.marks?-1:this.marks<s.marks?1:0;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}
