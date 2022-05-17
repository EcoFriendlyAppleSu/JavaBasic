package chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx05 {
    public static void main(String[] args) {
        HashSet<Object> setA = new HashSet<>();
        HashSet<Object> setB = new HashSet<>();
        HashSet<Object> setHab = new HashSet<>();
        HashSet<Object> setKyo = new HashSet<>();
        HashSet<Object> setCha = new HashSet<>();

        setA.add("A");
        setA.add("B");
        setA.add("C");
        setA.add("D");
        setA.add("E");

        System.out.println("setA = " + setA);

        setB.add("A");
        setB.add("F");
        setB.add("B");
        setB.add("D");
        setB.add("L");

        System.out.println("setB = " + setB);

        Iterator<Object> iterator = setB.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (setA.contains(next)) {
                setKyo.add(next);
            }
        }

        iterator = setA.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (!setB.contains(next)) {
                setCha.add(next);
            }
        }

        iterator = setA.iterator();
        while (iterator.hasNext()) {
            setHab.add(iterator.next());
        }
        iterator = setB.iterator();
        while (iterator.hasNext()) {
            setHab.add(iterator.next());
        }

        System.out.println();
        System.out.println("A Hab B = " + setHab);
        System.out.println("A Cha B = " + setCha);
        System.out.println("A kyo B = " + setKyo);



    }
}
