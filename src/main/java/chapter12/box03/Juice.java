package chapter12.box03;

public class Juice {
    private String name;

    public Juice(String name) {
        this.name = name + "Juice";
    } // 과일 주스를 만들고

    @Override
    public String toString() {
        return name;
    } // 주스 이름을 반환
}
