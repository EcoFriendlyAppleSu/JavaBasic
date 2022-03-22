package chapter07;

public class DeckSuffle {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick();
        System.out.println(c);

        d.suffle();
        c = d.pick();
        System.out.println(c);
    }
}

class Deck {
    public static final int CARD_NUM = 52;
    Card carArr[] = new Card[CARD_NUM];

    public Deck() { // init
        int i = 0;

        for (int j = Card.KIND_MAX; j > 0; j--) {
            for (int k = 0; k < Card.NUM_MAX; k++) {
                carArr[i++] = new Card(j, k + 1);
            }
        }
    }

    /*Card pick(int index) { // 특정 인덱스 출력
        return carArr[index];
    }*/

    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return carArr[index];
    }

    void suffle() {
        for (int i = 0; i < carArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);

            Card temp = carArr[i];
            carArr[i] = carArr[r];
            carArr[r] = temp;
        }
    }
}
class Card {
    static final int KIND_MAX = 4; // card shapes
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "SPADE", "DIAMOND", "HEART", "CLOVER"};
        String numbers = "0123456789XJQK";

        return "kind : " + kinds[this.kind] + " number : " + numbers.charAt(this.number);
    }
}
