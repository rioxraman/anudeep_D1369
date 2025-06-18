import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array2Set{
 public static <T> Set<T> convertArraytoSet(T array[]){
    Set<T> set = new HashSet<>(Arrays.asList(array));//method 2
//    for(T t:array){
//        set.add(t);
//    }  //METHOD 1
    return set;
 }
}
