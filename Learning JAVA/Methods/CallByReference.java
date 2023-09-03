package Methods;

public class CallByReference {
    // init method with formal params
    static String welcome(String n){
        // here n var will point object of name object of main method
        return ("Hello "+n);
    }

    // main method that is calling welcome method
    public static void main(String[] args) {
        String name = "Shubham";
        //here welcome method is called But her object is passed as a parameter cause ref name contains string object
        System.out.println(welcome(name));
    }
     // this is known as call by reference ie object is called by or copied by method of formal params
}
