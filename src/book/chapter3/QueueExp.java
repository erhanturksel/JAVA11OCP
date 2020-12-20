package book.chapter3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExp {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(4);
        queue.offer(3);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }
}
