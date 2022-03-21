package chapter06;

public class OOP01 {
    public static void main(String[] args) {
        TV LgTv = new TV(); // 인스턴스 생성을 다음과 같이 수행한다.
        LgTv.power = true;
        LgTv.channel = 7;

        LgTv.channelUp();
        System.out.println("LgTv.channel = " + LgTv.channel);
        LgTv.power();
        System.out.println("LgTv.power = " + LgTv.power);
    }
}

