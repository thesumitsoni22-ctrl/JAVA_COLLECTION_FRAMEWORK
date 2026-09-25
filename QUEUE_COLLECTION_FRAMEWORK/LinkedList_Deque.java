package QUEUE_COLLECTION_FRAMEWORK;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Deque {
    public static void main(String[] args) {

           Queue<Integer> q = new LinkedList<>();
//        to use methods like addfirst(), addlast() must replace the Queue with Deque
            //Deque<Integer> q = new LinkedList<>();
            q.offer(10); // add elements to the queuq
            q.offer(20);
            q.offer(30);
        System.out.println(q);

        System.out.println(q.peek()); // returns the head element
        q.poll();
        System.out.println(q); // returns and remove the head element
    }
}
