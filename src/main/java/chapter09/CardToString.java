package chapter09;

public class CardToString {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();

        System.out.println(card1); // println을 사용해 객체를 호출하면 object == object.toString이 출력된다.
        System.out.println(card1.toString());
        System.out.println(card2.toString());


    }
}
