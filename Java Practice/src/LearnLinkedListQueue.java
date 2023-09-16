import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        /*we can understand queue as a ticket counter line
         where the first person in the line gets the tickets first and if anyone
         wants to buy ticket he joins from the eol*/

        //initialiasing new queue
        Queue<Integer> numbers = new LinkedList<>();

        //to add in the queue we use offer
        numbers.offer(12);
        numbers.offer(23);
        numbers.offer(56);

        //print all ele of queue
//        System.out.println(numbers);

        // to remove ele from the queue we can use poll() function
        numbers.poll(); //removes first ele in the queue
        System.out.println(numbers.poll());

        // to peek next inline ele use peek() function
        System.out.println(numbers.peek());



    }
}
