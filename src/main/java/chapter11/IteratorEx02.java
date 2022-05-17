package chapter11;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorEx02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
