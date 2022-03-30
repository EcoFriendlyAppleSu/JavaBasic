package chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx04 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner scanner = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 입력해주세요");

        while (scanner.hasNextLine()) {
            try {
                inDate = df.parse(scanner.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("다시 입력해 주세요");
            }
        }

        Calendar cal1 = Calendar.getInstance();
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        cal1.setTime(inDate);
        System.out.println(df2.format(inDate));
    }
}
