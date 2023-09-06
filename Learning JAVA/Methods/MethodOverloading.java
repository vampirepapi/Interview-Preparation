package Methods;

public class MethodOverloading {
    
    //init max method with two int params and find max 
    static int max(int a, int b){
        return a>b?a:b;
    }
    //init max method with two float params and find max 
    static float max(float a, float b){
        return a>b?a:b;                                                                                                                                                                                            
    }
    //init max method with three int params and find max 
    static int max(int a, int b, int c){
        return a>b&&a>c?a:(b>c?b:c);
    }

    public static void main(String[] args) {
        int x=10, b=15;
        // if you notice all the three methods have the same name but different parameters (dont consider return type)
        // this is called method overloading
        System.out.println(max(x, b));
        System.out.println(max(12.4f, 76.55f));
        System.out.println(max(11,12,13));

    }
} 
