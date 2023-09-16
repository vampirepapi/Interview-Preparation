import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        //init a set
        /*can be
        - HashSet
        - LinkedHashSet
        - Treeset*/

        Set<Integer> set = new HashSet<>();

        // add element to the set
        set.add(14);
        set.add(12);
        set.add(13);
        set.add(10);
        set.add(1);

        System.out.println(set);

        set.remove(1);
        System.out.println(set);

        System.out.println(set.contains(12));
        set.clear();
        System.out.println(set);
    }
}
