import java.util.*;

class KeyboardInt{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 nos :");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Sum of "+a+" + "+b+" = "+c);
	}
}