import java.util.ArrayList;
import java.util.LinkedList;

public class LLDemo {
    public static void main(String[] args) {
        ArrayList<String> books= new ArrayList<>();
        books.add("apple");
        books.add("banana");
        books.add("cherry");

        LinkedList <String> linkedList =new LinkedList<>();
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add(2,"Charlie");
        LinkedList <String> linkedList2 =new LinkedList<>();
        linkedList2.addAll(books);
        System.out.println("LinkedList:2 " + linkedList2);

    }
}
