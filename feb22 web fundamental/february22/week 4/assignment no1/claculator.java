import java.util.Scanner;
public class claculator {
    public static void add(int a,int b){
        int sum=a+b;
        System.out.println("the addition is "+sum);
    }
    public static void diff( int a ,int b){
        int diff =a-b;
        System.out.println("the difference is "+diff);
    }
    public static void mult(int a,int b){
        int product=a*b;
        System.out.println("the multiplication is "+product);
    }
    public static void div(int a,int b){
        int div=a/b;
        System.out.println("the division is "+div);
    }
    public static void avg(int a,int b){
        int avg=a+b/2;
        System.out.println("the average is "+avg);
    }
    public static void modulo(int a,int b){
        int mod=a%b;
        System.out.println("the modulo is "+mod);
    }
    
    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the 1st number:");
        int num1 =sc.nextInt();
        System.out.print("enter the 2st number:");
        int num2 =sc.nextInt();
        add(num1,num2);       
        diff(num1,num2);
        mult(num1,num2);
        div(num1,num2);
        avg(num1,num2);
        modulo(num1,num2);
        
    }
}


