import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {

        int count[] = {21, 23, -43, 53, 22, 65};
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <= 5; i++) {
            set.add(count[i]);
        }
        TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
        System.out.println("First element of the set is: " + (Integer) sortedSet.first());
        System.out.println("last element of the set is: " + (Integer) sortedSet.last());

    }
}
