package chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * stack : 순차적으로 데이터를 추가하고 삭제하는 Stack은 ArrayList가 적합
 * queue : 데이터 추가/삭제가 쉬운 LinkedList로 구현하는 것이 적합
 */
public class StackQueueEx01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        System.out.println("== stack ==");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

        System.out.println("== queue ==");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());

        }
    }
}
