package PrintingAndString;

public class FormattedPrint{
    public static void main(String args[]){
        int x=10;
        float f = 12.56f;
        char z = 'A';
        String str = "Shubham";

        System.out.printf("%1$d %2$f %1$d \n",x,f);

        System.out.printf("%3$s %2$f %1$d",x,f,str);

    }

}