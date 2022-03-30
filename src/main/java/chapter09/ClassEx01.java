package chapter09;

public class ClassEx01 {
    public static void main(String[] args) throws Exception {
        Card card1 = new Card();
        Card card2 = Card.class.newInstance();

        Class cObj = card1.getClass();

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());

    }
}
