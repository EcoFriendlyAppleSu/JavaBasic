package chapter14_lambda.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSample {
    public static void main(String[] args) {
        Student[] studentStream = {
                new Student("Kim", 3, 300),
                new Student("Lee", 1, 200),
                new Student("Choi", 2, 100),
                new Student("Park", 2, 150),
                new Student("Lim", 1, 200),
                new Student("Baek", 3, 290),
                new Student("Gu", 3, 180)
        };

        Stream<Student> stuStream = Stream.of(studentStream);
        stuStream.sorted(Comparator.comparing(Student::getBan)).forEach(System.out::println);

        stuStream = Stream.of(studentStream); // again Stream
        IntStream intStream = stuStream.mapToInt(Student::getTotalScore);
        IntSummaryStatistics statistics = intStream.summaryStatistics();
        System.out.println("statistics.getAverage() = " + statistics.getAverage());
        System.out.println("statistics.getMin() = " + statistics.getMin());
        System.out.println("statistics.getCount() = " + statistics.getCount());

        Arrays.stream(studentStream);
    }
}
