import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {

        // defined new arraylist of String type
        ArrayList<String> studentName = new ArrayList<>();

        // appending new element to the Arraylist
        // to remove and add element TC is of O(n)
        studentName.add("Shubham");
        studentName.add("Sourabh");
        studentName.add("Laukik");

        // can add element at particular index too and shifts the curr ele ie on specified idx to right
        studentName.add(1,"Sourabha");
        studentName.add("Vishesh");
        System.out.println(studentName);
        studentName.add("Monika");
        System.out.println(studentName);

        // removing an element from the arraylist from idx 1
        studentName.remove(1);
        System.out.println(studentName);
        studentName.add("Shubham");

        // removing element with String Shubham from the list, it removes firstly encountered value
        //TC = On
        studentName.remove(String.valueOf("Shubham"));
        System.out.println(studentName);

        // defined a new arraylist
        ArrayList<String> childName = new ArrayList<>();
        childName.add("Bhavesh");
        childName.add("Om Sahu");
        System.out.println(childName);

        // extending arraylist studentName with childName arraylist
        studentName.addAll(childName);
        System.out.println(studentName);
        // to remove all elements of the list
        childName.clear();
        System.out.println(childName);

        // if we need to set an element at particular index or updates that idx element
        //TC = O(1)
        studentName.set(0,"Raghav");
        System.out.println(studentName);

        // if we want to check the element is present in that list or not
        System.out.println(childName.contains("Bhavesh"));
        System.out.println(studentName.contains("Om Sahu"));

        //Iterating arraylist - type1 [normal for loop]
        for(int i=0; i<studentName.size(); i++){
            System.out.println("Name of the student is: " + studentName.get(i));
        }

        //Iterating arraylist - type2 [known as for each loop or Enhanced For]
        for(String student:studentName){
            System.out.println("Hi "+student);
        }

        //Iterating arraylist - type3 [Iterator]
        Iterator<String> it = studentName.iterator();
        while (it.hasNext()){
            System.out.println("Iterator it says Good Morning "+it.next());
        }


    }
}
