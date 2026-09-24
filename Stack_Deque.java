import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_Deque {
    static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
