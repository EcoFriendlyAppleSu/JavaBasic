package chapter06;

public class OOP03 {
    public static void main(String[] args) {
        Card card1 = new Card("space", 5);

        System.out.println(Card.height);
        System.out.println(Card.width);

        System.out.printf("");
        System.out.printf("instance 변수 출력 = %s\n", card1.shape);
        System.out.printf("instance 변수 출력 = %d\n", card1.number);

        System.out.println(card1.shape.equals("space"));
    }
}

class Card {
    public String shape; //instance Var
    public int number;

    public Card(String shape, int number) {
        this.shape = shape;
        this.number = number;
    }

    static public int height = 250;
    static public int width = 100;

}
