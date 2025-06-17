import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(2);


        queue.add("Apple");
        queue.add("ba");
//        queue.add("Apsssple");
//        queue.offer("Apsssple"); //returns false
        System.out.println(queue.offer("Apsssple"));
        System.out.println(queue);
    }
}
