package chapter14_lambda.lambdaEx01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaEx02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // print all list's elements
        list.forEach(System.out::print);
        System.out.println();

        // list에서 제외한 데이터 필터
        List<Integer> resultList = list.stream().filter(x -> x % 2 == 0 && x % 3 == 0).collect(Collectors.toList());
        System.out.println("resultList = " + resultList);

        // list에서 제거
        list.removeIf(x -> x % 2 == 0 && x % 3 == 0);
        System.out.println("list = " + list);

        // list의 각 요소에 10 곱하기
        list.replaceAll(i -> i * 10);
        System.out.println("list = " + list);

        int[] arys = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // return Arrays.stream(arys) -> return immutable List
        IntStream intStream = Arrays.stream(arys).filter(x -> x % 2 == 0);
        System.out.println("intStream = " + intStream.toString());
        PrimitiveIterator.OfInt iterator = intStream.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
