package chapter09;

class Card {

    String kind;
    int num;

    Card(){
        this("spade", 1);
    }

    public Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card{" +
                "kind='" + kind + '\'' +
                ", num=" + num +
                '}';
    }
}
