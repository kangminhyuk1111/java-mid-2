package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

    public static void main(String[] args) {
        final Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offer(5);

        System.out.println(deque);
    }
}
