package Methods;

public class MethodsPractice {
    //init a max method
    //made it static so that static main method can call it
    static int max(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }

    //init a min method
    int min(int i, int j){
        if(i<j){
            return i;
        }
        else{
            return j;
        }
    }

    //main method
    public static void main(String[] args) {
        int a=10, b=15, c, d;
        c=max(a,b);
        //error: calling non static method from static block
        //create obj of the class and call this non static method
        MethodsPractice mp = new MethodsPractice();
        d=mp.min(a,b);
        System.out.println(c);
        System.out.println(d);

    }
    
}
