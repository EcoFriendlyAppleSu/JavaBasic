package chapter12_Generics.school;

import java.util.Collections;

public class SingleClass {
    public static void main(String[] args) {
        Person<Student> studentPerson = new Person<>();
        Person<Teacher> teacherPerson = new Person<>();

        studentPerson.add(new Student("Kim", 100));
        studentPerson.add(new Student("Park", 85));
        studentPerson.add(new Student("Lee", 90));

        Collections.sort(studentPerson.getList(), new StudentComp());

        System.out.println(studentPerson.toString());

    }
}
