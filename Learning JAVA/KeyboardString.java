import java.util.*;

class KeyboardString{
	public static void main(String args[]){
		Scanner s =  new Scanner(System.in);
		String name;
		System.out.println("Enter your name :");
		// next() bs ek word ko read krega 
		// nextLine() pure sentence ko read krta hai
		name = s.nextLine();
		System.out.println("Hello "+name);
	}
}