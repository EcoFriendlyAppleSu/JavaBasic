package chapter10;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx02 {
    public static void main(String[] args) {
        Date today = new Date();
        Calendar instance = Calendar.getInstance();
        // Date date = new LocalDateTime;
        instance.set(2021, 10, 11);

        today = instance.getTime();

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("sdf1.format(sdf1) = " + sdf1.format(today));

    }
}
