import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        //init a priority queue - gives priority to the element
        // by default prority queue implements min heap to implement max heap we can pass Comparator.reverseOrder to constructor
        Queue<Integer> pq = new PriorityQueue<>();

        // we can use the same functions of queue that we implemented earlier
        // here min heap is implemented by default, so min ele will be given top priority
        pq.offer(21);
        pq.offer(22);
        pq.offer(20);
        pq.offer(13);

        System.out.println(pq);

        // to remove first ele from the priority queue use poll function
        System.out.println(pq.poll());
        System.out.println(pq);

        //peek next in line element from priority queue
        System.out.println(pq.peek());
    }



}
