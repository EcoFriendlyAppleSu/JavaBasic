package chapter11;

import java.util.*;

public class TreeMapEx01 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < data.length; i++) {
            if (treeMap.containsKey(data[i])) {
                int value = treeMap.get(data[i]);
                treeMap.put(data[i], value + 1);
            } else {
                treeMap.put(data[i], 1);
            }
        }

        Iterator<Map.Entry<String, Integer>> iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            Integer value = next.getValue();
            System.out.println(next.getKey() + " : " + printChar('#', value) + " " + value);
        }
        System.out.println();

        Set set = treeMap.entrySet();
        ArrayList arrayList = new ArrayList(set);

        Collections.sort(arrayList, new ValueComparator());

        Iterator iterator1 = arrayList.iterator();

        while (iterator1.hasNext()) {
            Map.Entry next = (Map.Entry) iterator1.next();
            int value = (Integer) next.getValue();
            System.out.println(next.getKey() + " : " + printChar('#', value) + " " + value);
        }
    }

    private static String printChar(char c, Integer value) {
        char[] ch = new char[value];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = c;
        }
        return new String(ch);
    }

    private static class ValueComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;

                int value1 = ((Integer)e1.getValue()).intValue();
                int value2 = ((Integer) e2.getValue()).intValue();
                return value2 - value1;
            }
            return -1;
        }
    }
}
