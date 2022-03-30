package chapter09;

import java.util.Objects;

public class ObjNullNotNull {
    public static void main(String[] args) {
        String name = null;

        String s = namePrint(name);
        System.out.println(s);
    }

    public static String namePrint(String name) {
        if (Objects.isNull(name)) {
            return "name is null";
        } else {
            return "name is not null";
        }
    }
}
