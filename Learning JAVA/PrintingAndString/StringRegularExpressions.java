package PrintingAndString;

public class StringRegularExpressions {
    public static void main(String args[]){
        String str1 = "abc";
        String str2= "a";
        System.out.println(str1.substring(2).matches("."));
        System.out.println(str1.matches(str1.substring(2)));
        System.out.println(str1.matches(".")); // True for every character not for words!

        System.out.println(str2.matches("[abc]")); //here checks for str2 is any in "[abc]", works for a single charachter

        System.out.println(str2.matches("[^pqr]")); // checks if the str2 is not into [pqr]

        

    }
    
}
