package chapter07_01;

public class FinalCardTest {
    public static void main(String[] args) {
        Card card = new Card(10, "HEART");
        // card.NUMBER = 10; final var는 변경 불가

        System.out.println("card.KIND = " + card.KIND);
        System.out.println("card.NUMBER = " + card.NUMBER);
        System.out.println(card.toString());
    }
}

class Card {
    final int NUMBER;
    final String KIND;

    static int width = 100; // card size
    static int height = 250;

    // getFinalMemberVarInit
    public Card(int NUMBER, String KIND) {
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}