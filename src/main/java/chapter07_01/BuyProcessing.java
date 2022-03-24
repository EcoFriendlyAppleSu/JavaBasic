package chapter07_01;

import chapter07_01.buy.Buyer;
import chapter07_01.buy.ProductComputer;
import chapter07_01.buy.ProductTv;

import java.util.Arrays;

public class BuyProcessing {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        String[] ary = {"123", "123", "123"};
        String ary2 = "2342342";

        buyer.buy(new ProductTv());
        buyer.buy(new ProductComputer());

        System.out.println("현재 남은 돈은 : " + Buyer.hasMoney);
        System.out.println("보유 포인트는  : " + Buyer.bonusPoint);
        System.out.println(Arrays.toString(ary));
        // System.out.println(Arrays.toString(ary2));
    }
}
