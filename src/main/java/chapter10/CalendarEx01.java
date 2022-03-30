package chapter10;

import java.util.Calendar;

public class CalendarEx01 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();

        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DATE));
        System.out.println(instance.get(Calendar.AM_PM));
        System.out.println(instance.get(Calendar.HOUR));
        System.out.println(instance.get(Calendar.MINUTE));

    }

}
