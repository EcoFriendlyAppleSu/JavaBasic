package chapter11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx01 {
    public static void main(String[] args) {
        String[] strings = {"cat", "dog", "lion", "tiger"};
        Arrays.sort(strings);
        System.out.println("strings = " + Arrays.toString(strings));

        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 x
        System.out.println("strings = " + Arrays.toString(strings));

        Arrays.sort(strings, new Descending());
        System.out.println("strings = " + Arrays.toString(strings));



    }
}

class Descending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}
