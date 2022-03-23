package chapter07_01;

import java.util.Arrays;

public class TimeTest {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.setHour(55);
        time1.setMinute(55);
        time1.setSecond(55);
        System.out.println(time1.toString());

    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (0 <= hour && hour <= 24) {
            this.hour = hour;
        } else {
            System.out.println("시간을 초과했습니다.");
            return;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (0 <= minute && minute <= 60) {
            this.minute = minute;
        } else {
            System.out.println("분을 초과했습니다.");
            return;
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (0 <= second && second <= 60) {
            this.second = second;
        } else {
            System.out.println("초를 초과했습니다.");
            return;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
