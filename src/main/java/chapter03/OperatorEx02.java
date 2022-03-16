package chapter03;

public class OperatorEx02 {
    public static void main(String[] args) {
        char c1 = 'a';

        /*
        * 상수 또는 리터럴 간의 연산은 실행 과정동안 변하는 값이
        * 아니기 때문에, 컴파일 시에 컴파일러가 계산해서 그 결과로
        * 대체함으로써 코드를 보다 효율적으로 만든다.
        *
        * 변수가 들어가 있는 경우 컴파일러가 미리 계산을 할 수 없기
        * 때문에 형변환을 해주어야 한다.
        * */
        // char c2 = c1 + 1; error 발생
        char c3 = 'a' + 1;
        System.out.println("c3 = " + c3);
    }
}
