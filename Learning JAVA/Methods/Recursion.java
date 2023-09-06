package Methods;

// recursion means function call itself
public class Recursion {
    //init recursive fun1 method
    static void fun1(int n){
        if (n>0){
            System.out.println(n); // here value will be printed first
            fun1(n-1); // then method will be called again
        }
    }

    // init another fun2 method
    static void fun2(int n){
        if (n>0){
            fun2(n-1); //recursive method will be called first
            System.out.println(n); //when it reaches its condition after recursive method it will print the values

        }
    }
    
    public static void main(String[] args) {
        // first val will be printed then the resting recursive methods will be called
        fun1(3); // here op -> 3,2,1

        //here recursive method will be called first, after condition is reached it will start printing values from the bottom
        fun2(3); // here op -> 1,2,3

    }
}
