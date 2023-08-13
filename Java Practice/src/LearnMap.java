import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

        Map<String, Integer> mp = new HashMap<>();
        mp.put("One", 1);
        mp.put("Two", 2);
        mp.put("Three", 3);
        mp.put("Four", 4);

        if(!mp.containsKey("One")){
            mp.put("One", 1);
        }

        System.out.println(mp);

        //iterating through map
        for(Map.Entry<String, Integer> e: mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(mp.containsKey("One"));

        System.out.println(mp.isEmpty());

    }
}
