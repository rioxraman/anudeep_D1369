import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeDemo {
    public static void main(String[] args) {
//        Deque<String> deque = new ArrayDeque<>(4); // intial dynamic data type
        Deque<String> deque = new LinkedBlockingDeque<>(3);
            deque.add("Apple");
            deque.addFirst("ba");
            deque.offer("himanushu Tripathi");
            deque.offer("kHhushi sharma ");
            deque.offer("richa");
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.remove());
        System.out.println(deque.remove());
    }
}
