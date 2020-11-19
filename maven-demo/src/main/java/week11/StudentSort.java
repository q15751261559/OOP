package week11;

import com.zhenyu.java.week7.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentSort {
    public static void main(String[] args) {
        Student stu1= Student.builder()
                .StudentName("aaa")
                .age(18)
                .build();
        Student stu2= Student.builder()
                .StudentName("bbb")
                .age(19)
                .build();
        Set<Student> students=new HashSet<>();
        students.add(stu1);
        System.out.println(students);
    }
}
