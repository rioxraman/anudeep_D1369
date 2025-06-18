import java.util.TreeMap;

public class TreeMapDemo2 {
public static void main(String[] args) {

    TreeMap<String,Integer> grades= new TreeMap<>();
    grades.put("farhan",100);
    grades.put("priya",82);
    grades.put("richard",85);
    grades.put("farhan",84);
    System.out.println(grades);
    System.out.println(grades.get("priya"));

}
}
