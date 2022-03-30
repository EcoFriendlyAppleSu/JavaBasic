package chapter10;

import java.util.Calendar;

public class CalendarEx03 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();

        instance.set(2022, 10, 25);
        System.out.println(toString(instance));

        instance.roll(Calendar.MONTH, 3);
        System.out.println(toString(instance));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년" + date.get(Calendar.MONTH) + "월" + date.get(Calendar.DATE) + "일";
    }

}
