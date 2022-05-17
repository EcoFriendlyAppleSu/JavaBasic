package chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // List에선 ADD를 StringBuffer에선 append를 사용
        list.add("ABC");
        list.add("DEF");
        list.add("GHR");
        list.add("JKF");

        Iterator<String> iterator = list.iterator();// stream.iterator(); 는 뭐지?

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
