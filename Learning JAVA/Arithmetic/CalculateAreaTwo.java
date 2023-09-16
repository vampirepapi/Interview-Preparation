package Arithmetic;

import java.util.Scanner;

public class CalculateAreaTwo{
    public static void main(String args[]){
        int a,b,c;
        float s,area;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a, b, c : ");
        a = sc.nextInt();
        b =  sc.nextInt();
        c = sc.nextInt();

        s = ((a+b+c)/2f);
        area = (s*(s-a)*(s-b)*(s-c));
        
        System.out.println(Math.sqrt(area));
        
    }
}