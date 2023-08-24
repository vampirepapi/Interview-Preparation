package ConditionalStatement;

public class ElseIfLadder{
    public static void main(String args[]){
        int a =32;
        if(a%3==0){ 
            System.out.println("a%2 ==0");
        }
        else if(a%4==0){
            System.out.println("a%4 ==0");
        }
        else if(a%8==0){
            System.out.println("a%8 ==0");
        }
        if(a%16==0){
            System.out.println("a%16 ==0");
        }
        else if(a%8==0){
            System.out.println("a%8 ==0");
        }
        else{
            System.out.println("a%32 ==0");
        }
    }
}