import java.util.Deque;
import java.util.Queue;
import java.util.ArrayDeque;

public class Array_Deque {
    static void main(String[] args) {

//        Queue<Integer> q = new ArrayDeque<>(); due to methods like offerfirst last to run..replace wid Deque
        Deque<Integer> q = new ArrayDeque<>();
         q.offer(10);
         q.offerFirst(5);
         q.offerLast(15);
        System.out.println(q);

        q.pollLast();
        System.out.println(q);
        q.pollFirst();
        System.out.println(q);

        System.out.println(q.size());

        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
    }
}
