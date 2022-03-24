package chapter07_01;

import java.util.Scanner;

public class DiscountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DiscountManager discountManager = new DiscountManager();
        DiscountPolicy policy = discountManager.getDiscountPolicy("Gold");
        policy.discount();
        /*DiscountPolicy discountPolicy = new DiscountManager().getDiscountPolicy(new NormalMemberDiscount());
        discountPolicy.discount();
        discountPolicy = new GoldMemberDiscount();
        discountPolicy.discount();*/

    }
}
