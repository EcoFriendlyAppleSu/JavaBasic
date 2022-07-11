package chapter14_lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLotto {
    public static void main(String[] args) {
        StreamLotto streamLotto = new StreamLotto();
        streamLotto.sample();
    }

    private void sample() {
        IntStream ints = new Random().ints(6, 1, 45);
        List<Integer> collect = ints.boxed().collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
