import java.util.Comparator;
import java.util.PriorityQueue;

//public class MaxCompartaor implements Comparator<String>{
//    @Override
//    public int max(String o1, String o2) {
//        return o2.length()-o1.length();
//
//    }
//}
//
//public class MinCompartaor implements Comparator<String>{
//    @Override
//    public int min(String o1, String o2) {
//        return o1.length()-o2.length();
//
//    }
//}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(4, new AorderCompartaor());
        queue.add("Richard Maxwell");
        queue.add("himanushu Tripathi");
        queue.add("kHhushi sharma ");
        queue.add("abjisjek shani");

        System.out.println(queue);

    }
}

