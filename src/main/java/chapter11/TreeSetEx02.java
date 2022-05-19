package chapter11;

import java.util.TreeSet;

public class TreeSetEx02 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        String from = "b";
        String to = "d";

        treeSet.add("abc");
        treeSet.add("alien");
        treeSet.add("bar");
        treeSet.add("car");
        treeSet.add("Car");
        treeSet.add("disc");
        treeSet.add("dance");
        treeSet.add("dZZZZ");
        treeSet.add("dzzzzzz");
        treeSet.add("elephant");
        treeSet.add("elevator");
        treeSet.add("fan");

        System.out.println(treeSet);
        System.out.println("range search : from " + from + " " + to + " to " + to);
        System.out.println("result1 = " + treeSet.subSet(from, to));
        System.out.println("result2 = " + treeSet.subSet(from, to + "zzz")); // 대문자가 소문자보다 우위를 갖는다.

    }
}
