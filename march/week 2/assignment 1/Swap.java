import java.util.Scanner;
public class Swap {  
    public static void main(String args[]) {  
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st String  ");
        String a=sc.nextLine();
        System.out.print("enter the 2st String  ");
        String b=sc.nextLine();
        //String a = "Love";  
        //String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  
}  