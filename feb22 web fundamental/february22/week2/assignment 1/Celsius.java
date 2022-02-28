import java.util.Scanner;
public class Celsius  
 {  
   public static void main (String args[])  
    {
        float Celsius;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Fahrenheit ");
        float Fahrenheit = sc.nextFloat();
         
        Celsius  = ((Fahrenheit-32)*5)/9;  
        System.out.println("Temperature in celsius is: "+Celsius);  
    }
}  