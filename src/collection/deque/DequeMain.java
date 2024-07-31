package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

    public static void main(String[] args) {
        final Deque<Integer> deque = new ArrayDeque<>();

        // 데이터 추가
        deque.offerFirst(1);
        System.out.println("deque = " + deque);
        deque.offerFirst(2);
        System.out.println("deque = " + deque);
        deque.offerFirst(3);
        System.out.println("deque = " + deque);
        deque.offerLast(4);
        System.out.println("deque = " + deque);
        deque.offerLast(5);
        System.out.println("deque = " + deque);
    }
}
