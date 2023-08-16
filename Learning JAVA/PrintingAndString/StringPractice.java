package PrintingAndString;

public class StringPractice {
    public static void main(String[] args) {

        char c[] = {65,66,67,68};
        String strC = new String(c,1,2);

        System.out.println(strC);


        String str1 = "Shubham";
        String str2 = "Shubham";
        String str3 = new String("Shubham");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
    }
    
}
