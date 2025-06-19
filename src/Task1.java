
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task1  {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put("Alice", 25);
        treeMap.put("Bob", 30);
        treeMap.put("Charlie", 28);
        treeMap.put("David", 22);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an age to search: ");
        int ageToSearch = scanner.nextInt();

        boolean found = false;
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() == ageToSearch) {
                System.out.println("Name with age " + ageToSearch + ": " + entry.getKey());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No name found with age " + ageToSearch);
        }

        scanner.close();
    }

}

