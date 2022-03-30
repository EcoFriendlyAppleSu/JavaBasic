package chapter09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = {"bat", "bonus", "cat", "call", "date"};

        Pattern pattern = Pattern.compile("c[a-z]*");

        for (int i = 0; i < data.length; i++) {
            Matcher m = pattern.matcher(data[i]);
            if (m.matches()) {
                System.out.print(data[i] + ",");
            }
        }
    }
}
