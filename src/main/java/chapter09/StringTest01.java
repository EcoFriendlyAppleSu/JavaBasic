package chapter09;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringTest01 {
    public static void main(String[] args) {
        String str1 = "animal,cat,dog";
        String[] str2 = str1.split(",");

        System.out.println(str2[0]);
        System.out.println(str2[1]);
        System.out.println(str2[2]);

        for (String temp :
                str2) {
            System.out.println("temp = " + temp);
        }

        System.out.println(String.join("-", str2));

        StringJoiner sj = new StringJoiner("/", "[", "]");
        for (String a :
                str2) {
            sj.add(a);
        }
        System.out.println(sj.toString());

    }
}
