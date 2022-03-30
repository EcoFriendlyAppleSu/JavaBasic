package chapter10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx01 {
    public static void main(String[] args) {
        DecimalFormat dc1 = new DecimalFormat("#,###.##");
        DecimalFormat dc2 = new DecimalFormat("#.###E0");

        try {
            Number num = dc1.parse("1,234,567,89");
            System.out.print("1,234,567,89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");
            System.out.println(dc2.format(num));
        } catch (ParseException e) {
        }
    }
}
