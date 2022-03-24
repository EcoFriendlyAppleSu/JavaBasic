package chapter07_01;

public class DiscountManager {

    public DiscountPolicy getDiscountPolicy(String rank) {
        if (rank.equals("Gold")) {
            return new GoldMemberDiscount();
        }
        return new NormalMemberDiscount();
    }

}
