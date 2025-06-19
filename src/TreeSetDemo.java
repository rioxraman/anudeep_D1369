import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
////        TreeSet<String> ts = new TreeSet<String>(Arrays.asList("1","raman","richard","maxwell"));
//        Comparator<Integer> desc =(a,b) ->b-a;
//        TreeSet<Integer> set = new TreeSet<>(desc);
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        System.out.println(set);
        SortedSet<String> orignalSet = new TreeSet<>();
        orignalSet.add("E");
        orignalSet.add("A");
        orignalSet.add("P");
        TreeSet<String> treeSet = new TreeSet<>(orignalSet);

// deeep debtqanu
    }
}
