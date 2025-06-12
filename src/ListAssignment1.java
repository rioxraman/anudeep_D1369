import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAssignment1 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date"));
        System.out.println("original list: " + words);
        Collections.reverse(words);


        System.out.println("Reversed list: " + words);



    }

}