package chapter10;

import java.time.LocalDate;
import java.time.LocalTime;

public class NewTimeEx01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birth = LocalDate.of(1995, 02, 16);
        LocalTime birthTime = LocalTime.of(12, 24);

        System.out.println(today);
        System.out.println(now);

        System.out.println(birth);
        System.out.println(birthTime);

        System.out.println(birth.plusDays(1));
        System.out.println(birth.withYear(2345));

    }
}
