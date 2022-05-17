package chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx03 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(i + ""); // 이건 가능하다 왜냐하면 string type에선 i + ""을 string type으로 반환하기 때문
        }
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            list2.add(iterator.next());
        }

        System.out.println("==== list1 copy list2 ====");
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();

        iterator = list1.iterator();
        while (iterator.hasNext()) {
            list3.add(iterator.next());
            iterator.remove();
        }

        System.out.println("==== list1 copy list3 ====");
        System.out.println("list1 = " + list1);
        System.out.println("list3 = " + list3);
        System.out.println();

    }
}
