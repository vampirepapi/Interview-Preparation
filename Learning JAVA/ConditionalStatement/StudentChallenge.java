package ConditionalStatement;

import java.util.Scanner;

public class StudentChallenge {
    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        if(number%2!=0){
            System.out.println("number "+number+" is an odd number");
        }
        else{
            System.out.println("number "+number+" is an even number");
        }
        
    }
}
