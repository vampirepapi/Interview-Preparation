package Arithmetic;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String args[]){
        float area,base,height;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base and height: ");
        base = s.nextFloat();
        height = s.nextFloat();
        area =((1f/2f)*(base*height));
        System.out.println(area);
    }
    
}
