import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<String>(3, 0.75F);
        hs.add("E");
        hs.add("A");
        hs.add("E");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);
    }
}
