package chapter11;

import java.util.*;

public class HashMapEx02 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Lee", 80);
        map.put("Kim", 60);
        map.put("Choi", 70);
        map.put("Park", 95);

        // entrySet을 통해 key, value를 가져올 수 있다.
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println("Name = " + next.getKey() + " Score = " + next.getValue());
        }

        System.out.println("참가자 명단 " + entries);
        Collection<Integer> values = map.values();
        Iterator<Integer> iteratorInt = values.iterator();
        int total = 0;

        while (iteratorInt.hasNext()) {
            total += iteratorInt.next();
        }

        System.out.println(total);

    }
}
