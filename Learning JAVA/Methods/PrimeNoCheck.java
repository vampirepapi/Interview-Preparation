package Methods;

import java.util.Scanner;

public class PrimeNoCheck {

    static boolean isPrime(int n){
        boolean flag = true;
        for(int i=2; i<n/2+1; i++){
            if(n%i==0){
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(isPrime(n));

        
        
    }
    
}
