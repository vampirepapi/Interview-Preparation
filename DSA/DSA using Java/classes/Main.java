package classes;

public class Main {
    
    public static void main(String[] args) {
        // New cookie class object
        Cookie cookieOne = new Cookie("Yellow");
        Cookie cookieTwo = new Cookie("Green");
        Cookie cookieThree = new Cookie(12);

        //get color using getter method
        System.out.println(cookieOne.getColor());
        
        //setting new color using setter method
        cookieTwo.setColor("Blue");
        System.out.println(cookieTwo.getColor());

        System.out.println(cookieThree.length);

    }
}
