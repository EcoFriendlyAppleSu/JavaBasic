package chapter11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {
    public static void main(String[] args) {
        Object[] obj = {"1", new Integer(1), "2", "2", "3", "4"};
        HashSet<Object> objects = new HashSet<>();

        Iterator<Object> iterator = Arrays.stream(obj).iterator();

        while (iterator.hasNext()) {
            objects.add(iterator.next());
        }

        System.out.println(objects);
    }
}
