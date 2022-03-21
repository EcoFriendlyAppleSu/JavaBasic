package chapter06;

import java.util.Arrays;

public class OOP02 {
    public static void main(String[] args) {

        TV[] tvAry = new TV[3];
        tvAry[0] = new TV("samsung", false, 71);
        tvAry[1] = new TV("lg", false, 44);
        tvAry[2] = new TV("apple", false, 37);

        for (TV temp :
                tvAry){
            System.out.println(temp);
        }
    }
}
