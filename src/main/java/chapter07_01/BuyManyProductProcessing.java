package chapter07_01;

import chapter07_01.buyManyProduct.*;

public class BuyManyProductProcessing {
    public static void main(String[] args) {

        Buyer buyer = new Buyer();

        buyer.buy(Book.getBookInstance());
        buyer.buy(MacBook.getMacBookInstance());
        buyer.buy(Radio.getRadioInstance());
        buyer.summary();
        System.out.println(Buyer.hasMoney +" "+ Buyer.bonusPoint);

    }
}
