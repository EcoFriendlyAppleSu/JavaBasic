package chapter11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx04 {

    public static void main(String[] args) {

        HashSet<Person> personHashSet = new HashSet<>();

        personHashSet.add(new Person("kin", 10));
        personHashSet.add(new Person("kin", 10));
        personHashSet.add(new Person("le", 20));

        System.out.println(personHashSet);
        Iterator<Person> iterator = personHashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
