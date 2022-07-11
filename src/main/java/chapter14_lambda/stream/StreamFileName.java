package chapter14_lambda.stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamFileName {
    public static void main(String[] args) {
        File[] files = {
                new File("ex1.java"),
                new File("ex2.java"),
                new File("ex3"),
                new File("ex1.txt"),
                new File("ex6.class"),
        };

        Stream<File> fileStream = Stream.of(files);

        // Stream<File> to Stream<String> using stream.map()
        Stream<String> fileNameStream = fileStream.map(File::getName);

        fileNameStream.forEach(System.out::println); // iterator와 마찬가지로 한 번 사용하면 다시 선언해서 사용해야함

        fileStream = Stream.of(files);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1)
                .map(s -> s.substring(s.indexOf('.') + 1))
                .map(String::toUpperCase)
                .distinct()
                .forEach(System.out::print);

    }
}
