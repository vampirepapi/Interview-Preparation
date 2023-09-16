package Methods;

public class CallByValue {
    //init method with formal params
    //here values of actual params of main method gets copied to this method
    static int add(int x, int y){
        int z;
        z=x+y;
        return z;

    }

    //main method with actual params
    public static void main(String[] args) {
        int a=10, b=5, c;
        //calling add method
        c = add(a,b);
        System.out.println(c);
    }
    // this is known as call by value ie value is called by or copied by method of formal params
}
