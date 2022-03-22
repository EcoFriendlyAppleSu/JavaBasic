package chapter07;

public class Tv {
    public static void main(String[] args) {
        ChildTv childTv = new ChildTv();
        childTv.power = true;
        childTv.channel = 10;
        childTv.channelUp();
        childTv.channelUp();
        System.out.printf("channel : %d\n", childTv.channel); // channel value is 12

        childTv.displayCaption("hello world");
        childTv.caption = true;
        childTv.displayCaption("hello world");
        childTv.setStVar();
        childTv.parentStaticVarPrint();

    }
}

class ParentTv {
    public int channel;
    public boolean power;
    public static int stVar; //final을 사용하려면 var를 붙여야한다.

    void power() {
        power = !power;}
    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

    void setStVar() {
        stVar = 10;
    }
}

class ChildTv extends ParentTv {
    public boolean caption;

    void displayCaption(String text) {
        if (this.caption) {
            System.out.println(text);
        }
    }

    void parentStaticVarPrint() {
        System.out.printf("Parent static var print = %d", stVar);
    }
}