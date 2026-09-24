import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue_Basics {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();
//        default behaviour -> integers -> less value -> High priority -> MinHeap data Structure concept
//        pq -> in case of strings -> write own comparator used in maxheap
        System.out.println("MINHEAP DS");
        pq.add(10);
        pq.add(40);
        pq.add(33);
        pq.add(23);
        pq.add(5);
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

//       REVERSE OF -> Making behaviour -> integers -> highest value -> High priority -> MaxHeap Data Structure Concept
        Queue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a);
        System.out.println("MAXHEAP DS");
        pq2.add(10);
        pq2.add(40);
        pq2.add(33);
        pq2.add(23);
        pq2.add(5);
        System.out.println(pq2);

        System.out.println(pq2.poll());
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);



    }
}
