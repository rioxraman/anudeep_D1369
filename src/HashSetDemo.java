import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        System.out.println(hs.size());
        System.out.println("------------------");
        hs.add("1UNK>");
        hs.add("2UNK>");
        hs.add("3UNK>");
        hs.add("4UNK>");
        System.out.println(hs.size());
        System.out.println("------------------");
        System.out.println(hs);
    }
}
