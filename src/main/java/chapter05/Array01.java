package chapter05;

public class Array01 {
    public static void main(String[] args) {
        int[] ary = new int[5]; // 초기화 후 0을 확인
        for (int temp : ary) {
            System.out.printf("temp = %d\n", temp);
        }

        int[] score1 = new int[]{50, 60, 70, 80, 90};
        int[] score2 = {50, 60, 70, 80, 90};
        // int[] score3;
        // score3 = new int[]{50, 60, 70, 80, 90}; 사용 가능하다.
        // score3 = {50, 60, 70, 80, 90}; 생성과 초기화를 따로 뒀을 경우 error 발생

    }
}
