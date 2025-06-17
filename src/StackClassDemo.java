import java.util.Stack;

public class StackClassDemo {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.add(2,3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack);
        System.out.println(stack.search(2));

    }
}
