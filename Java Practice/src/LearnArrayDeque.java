import java.util.ArrayDeque;
import java.util.Queue;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();

        adq.offer(12);
        adq.offerFirst(45);
        adq.poll();
        adq.pollLast();
        adq.pollFirst();
        adq.peek();
        adq.peekFirst();
        adq.peekLast();
        System.out.println(adq);
    }
}
