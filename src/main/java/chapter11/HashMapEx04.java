package chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx04 {

    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i], value + 1);
            } else {
                map.put(data[i], 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            int value = next.getValue();
            System.out.println(next.getKey() + " : " + printBar('#', value) + " " + value);
        }

    }

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }

        return new String(bar); // char to String
    }
}
