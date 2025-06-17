import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(2,5);
        v.add("a");
        v.add("b");
        v.add("c");
        v.addElement("21");
        v.addElement("d");
        v.addElement("d");
        v.addElement("d");
        System.out.println(v.capacity());
    }
}
