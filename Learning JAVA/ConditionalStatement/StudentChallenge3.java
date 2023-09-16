package ConditionalStatement;

import java.util.Scanner;

public class StudentChallenge3 {
    /*
     Program to find the type of website and protocol used -
     Author: Shubham
     */
    public static void main(String args[]){
        String url;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a url: ");
        url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));
        if("http".equals(protocol)){
            System.out.println("HTTP Protocol used");
        }
        else{
            System.out.println("other protocol");
        }

        String type = url.substring(url.lastIndexOf("."));
        System.out.println(type);
        

    }

}
