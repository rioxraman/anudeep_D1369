import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertArrayIntoSet {
    public static void main(String[] args) {
        String[] hs = {"aa","bb","cc"};
        System.out.println(Arrays.toString(hs));
        Set<String> hs1 = Array2Set.convertArraytoSet(hs);
        System.out.println(hs1);
    }
}
