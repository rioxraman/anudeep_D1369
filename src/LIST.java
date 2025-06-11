import java.util.*;

public class LIST {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Himanshu");
        names.add("Raman");
        names.add(1, "Ankit");  // Insert at index 1

        System.out.println(names.get(0));  // Himanshu

        names.set(1, "Aman");  // Replace "Ankit" with "Aman"
        System.out.println(names);        // [Himanshu, Aman, Raman]

        names.remove(2);  // Remove "Raman"
        System.out.println(names);        // [Himanshu, Aman]

        System.out.println("Index of Aman: " + names.indexOf("Aman"));
    }
}
