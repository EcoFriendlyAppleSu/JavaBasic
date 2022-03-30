package chapter10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx01 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf1;
        SimpleDateFormat sdf2;
        SimpleDateFormat sdf3;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
        sdf3 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");

        System.out.println("sdf1 = " + sdf1.format(today));
        System.out.println("sdf2 = " + sdf2.format(today));
        System.out.println("sdf3 = " + sdf3.format(today));
    }
}
