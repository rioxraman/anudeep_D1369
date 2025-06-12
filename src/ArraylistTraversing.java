import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistTraversing {
   public static void main(String[] args) {
       ArrayList<String> books= new ArrayList<>();
       books.add("apple");
       books.add("banana");
       books.add("cherry");
       System.out.println(books.indexOf("cherry"));
       System.out.println(books.contains("apple"));
       if(books.contains("apple")){
           System.out.println();
       }
       for (int i = 0; i < books.size(); i++) {
           if(books.indexOf("cherry")!=-1){
               System.out.println();
           }
       }
//       for(String i:books){
//           System.out.println(i);
//       }
////
//       Iterator It= books.iterator();
//       while (It.hasNext()){
//           System.out.println(It.next());
//       }
   }

}
