package Methods;

public class MethodsPractice2 {
    //init a method that takes an arr and changes its index to desired val
    static void change(int A[], int idx, int val){
        A[idx] = val;
    }

    //init method take a var and update it with a val
    static void updateVal(int x, int val){
        x=val;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        //calling change method
        change(A, 2, 9);
        
        for(int x:A){
            System.out.println(x);
        }
        //calling updateVal method
        int x = 10;
        updateVal(x, 20);
        System.out.println(x);

    }
}
