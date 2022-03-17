package chapter05;

public class Array04 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0.0f;

        int[] score = {100, 90, 76, 99, 88};

        for (int total :
                score) {
            sum += total;
        }

        average = sum / (float) score.length;

        System.out.printf("총 점수는 : %d\n", sum);
        System.out.printf("평균은 : %f\n", average);

    }
}
