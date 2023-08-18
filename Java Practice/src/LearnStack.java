import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        // initializing new animal stack
        Stack<String> animals = new Stack<>();

        //pushing elements to the stack
        animals.push("Lion");
        animals.push("tiger");
        animals.push("elephant");
        animals.push("rabbit");

        System.out.println(animals);
//
//        // to peek which ele is present at the the top of stack we use peek function
        System.out.println(animals.peek());
//
        //popping elements from the stack
        System.out.println(animals.pop());
        System.out.println(animals.peek());
        System.out.println(animals.contains("Lion"));

    }
}
