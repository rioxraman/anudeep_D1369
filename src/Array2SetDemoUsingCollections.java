import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Array2SetDemoUsingCollections {
    public static void main(String[] args) {
        Integer [] arr1 = {1,3,5,6,7,2,4};
        Set<Integer> set= new HashSet<>();

        Collections.addAll(set,arr1);

        System.out.println(set);
    }
}
